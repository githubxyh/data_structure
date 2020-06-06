package trie;

public class Trie {

    TrieNode root = new TrieNode('/');

    public void insert(char data[]) {
        TrieNode p = root;
        for(char c : data) {
            int index = c - 'a';
            if(p.children[index] == null) {
                p.children[index] = new TrieNode(c);
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    // 在Trie树中查找一个字符串
    public boolean find(char[] pattern) {
        TrieNode p = root;
        for (int i = 0; i < pattern.length; ++i) {
            int index = pattern[i] - 'a';
            if (p.children[index] == null) {
                return false; // 不存在pattern
            }
            p = p.children[index];
        }
        if (p.isEndingChar == false) return false; // 不能完全匹配，只是前缀
        else return true; // 找到pattern
    }
}
