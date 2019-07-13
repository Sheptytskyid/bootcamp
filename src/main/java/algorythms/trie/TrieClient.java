package algorythms.trie;

public class TrieClient {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.add("one");
        trie.add("two");
        trie.add("three");
        trie.add("four");
        trie.add("five");
        trie.add("six");

        System.out.println(trie.find("one"));
        System.out.println(trie.find("nine"));
    }
}
