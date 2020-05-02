package tree;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add2(4);
        bt.add(3);
        bt.add2(6);


        bt.preOrder();
        System.out.println();
        bt.midOrder();
        System.out.println();
        bt.postOrder();
    }

}
