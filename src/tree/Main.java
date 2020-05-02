package tree;

public class Main {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.add(4);
        bt.add(3);
        bt.add(6);
        bt.add(5);
        bt.add(7);

        bt.delete(6);
        //bt.delete(6);

        bt.preOrder();
        System.out.println();
        bt.midOrder();
        System.out.println();
        bt.postOrder();
    }

}
