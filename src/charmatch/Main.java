package charmatch;

public class Main {

    public static void main(String[] args) {

        char[] c = {'f','b','a','c','d','a','b','c','a','c'};
        char[] d = {'a','b','c','c'};

        //bm算法的坏字符规则
        //BMBadChar bm = new BMBadChar();
        //int i = bm.bm(c,c.length,d,d.length);
        //System.out.println(i);

        BruteForce bf = new BruteForce();
        int i = bf.bf(c,d);
        System.out.println(i);
    }

}
