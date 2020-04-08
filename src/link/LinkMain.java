package link;

public class LinkMain {
    public static void main(String[] args) {
        SingleLink sl = new SingleLink();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        //sl.printAll();
        ReverseLink r = new ReverseLink();
        r.reverse2(sl);
        sl.printAll();
    }
}
