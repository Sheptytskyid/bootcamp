package algorithms.graph;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

    Map<Vertex, Set<Vertex>> graph = new HashMap<>();

    void add(String label) {
        Vertex vertex = new Vertex(label);
        graph.putIfAbsent(vertex, new LinkedHashSet<>());
    }

    void remove(String label) {
        Vertex vertex = new Vertex(label);
        graph.values().forEach(l -> l.remove(vertex));
        graph.remove(vertex);
    }

    void addEdge(String label1, String label2) {
        Vertex vertex1 = new Vertex(label1);
        Vertex vertex2 = new Vertex(label2);
        graph.get(vertex1).add(vertex2);
    }

    Set<Vertex> getAdjVertices(String label) {
        return graph.get(new Vertex(label));
    }

    Set<String> breadthFirstSearch(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : getAdjVertices(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    queue.add(v.label);
                }
            }
        }
        return visited;
    }

    Set<String> depthFirstSearch(String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            for (Vertex v : getAdjVertices(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                    stack.add(v.label);
                }
            }
        }
        return visited;
    }

    private class Vertex {
        String label;

        Vertex(String label) {
            this.label = label;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Vertex vertex = (Vertex) o;

            return label.equals(vertex.label);
        }

        @Override
        public int hashCode() {
            return label.hashCode();
        }
    }
}
