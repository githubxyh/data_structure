package trie;

public class TrieNode {
    char data;
    TrieNode[] children;
    public boolean isEndingChar = false;

    public TrieNode(char data) {
        this.data = data;
        children = new TrieNode[26];
    }
}
