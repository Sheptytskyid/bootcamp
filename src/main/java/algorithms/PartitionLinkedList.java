package algorithms;

public class PartitionLinkedList {

    public static void main(String[] args) {
        Node node = new Node(3);
        node.next = new Node(6);
        Node next = node.next;
        next.next = new Node(8);
        next = next.next;
        next.next = new Node(5);
        next = next.next;
        next.next = new Node(10);
        next = next.next;
        next.next = new Node(2);
        next = next.next;
        next.next = new Node(1);
        node = partition(node, 15);
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.data >= x) {
                tail.next = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
