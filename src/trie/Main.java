package trie;

public class Main {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert(new char[]{'a','b','c'});
        boolean b = t.find(new char[]{'a','b','c'});
        boolean b2 = t.find(new char[]{'a','b'});
        System.out.println(b);
        System.out.println(b2);
    }
}
