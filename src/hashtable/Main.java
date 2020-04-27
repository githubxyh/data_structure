package hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable<Integer,String> t = new HashTable<>();
        t.put(1,"10");
        t.put(2,"20");
        t.put(3,"30");
        t.put(4,"40");
        t.put(5,"50");
        t.put(6,"60");
        t.put(7,"70");
        t.put(8,"80");
        t.put(9,"90");
        t.put(10,"100");
        t.put(11,"110");
        t.put(12,"120");

        t.delete(1);

        System.out.println(t.get(1));
        System.out.println(t.get(2));
        System.out.println(t.get(3));
        System.out.println(t.get(4));
        System.out.println(t.get(5));
        System.out.println(t.get(6));
        System.out.println(t.get(7));
        System.out.println(t.get(8));
        System.out.println(t.get(9));
        System.out.println(t.get(10));
        System.out.println(t.get(11));
        System.out.println(t.get(12));

    }

}
