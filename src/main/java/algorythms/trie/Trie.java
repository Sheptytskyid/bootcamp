package algorythms.trie;

import java.util.HashMap;
import java.util.Map;

class Trie {

    private TrieNode root = new TrieNode();

    void add(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            current = current.children.computeIfAbsent(word.charAt(i), TrieNode::new);
        }
        current.isWord = true;
    }

    boolean find(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            TrieNode node = current.children.get(word.charAt(i));
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isWord;
    }

    private class TrieNode {
        private Map<Character, TrieNode> children;
        private Character content;
        private boolean isWord;

        TrieNode() {
            children = new HashMap<>();
        }

        TrieNode(Character content) {
            this.content = content;
            children = new HashMap<>();
        }
    }
}
