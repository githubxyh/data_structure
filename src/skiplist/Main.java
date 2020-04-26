package skiplist;

public class Main {

    public static void main(String[] args) {
        SkipList sl = new SkipList();
        sl.insert(1);
        sl.insert(3);
        sl.insert(6);
        sl.insert(3);
        sl.insert(2);
        sl.insert(8);

        //sl.printAll();
        System.out.println(sl.find(8));
    }


}
