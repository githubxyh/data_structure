package tree;

public class BinaryTree {

    public TreeNode root;

    //递归添加
    public void add(int data) {
        if(root == null) {
            root = new TreeNode(data);
            return;
        }
        add(data,root);
    }

    //循环添加
    public void add2(int data) {
        if(root == null) {
            root = new TreeNode(data);
            return;
        }

        TreeNode pre = null;
        TreeNode temp = root;
        while (temp != null) {
            pre = temp;
            if(data < temp.data) {
                temp = temp.left;
            }else if(data > temp.data){
                temp = temp.right;
            }
        }

        if(data < pre.data) {
            pre.left = new TreeNode(data);
        }else if(data > pre.data){
            pre.right = new TreeNode(data);
        }
    }

    //前序遍历
    public void preOrder(){
        printPre(root);
    }

    //中序遍历
    public void midOrder(){
        printMid(root);
    }

    //后续遍历
    public void postOrder(){
        printPost(root);
    }

    private void add(int data, TreeNode treeNode) {
        if(data > treeNode.data) {
            if(treeNode.right == null) {
                treeNode.right = new TreeNode(data);
                return;
            }
            treeNode = treeNode.right;
            add(data, treeNode);
        }else if(data < treeNode.data) {
            if(treeNode.left == null) {
                treeNode.left = new TreeNode(data);
                return;
            }
            treeNode = treeNode.left;
            add(data, treeNode);
        }
    }

    private void printPre(TreeNode treeNode){
        if(treeNode == null) {
            return;
        }
        System.out.print(treeNode.data + ",");
        printPre(treeNode.left);
        printPre(treeNode.right);
    }

    private void printMid(TreeNode treeNode){
        if(treeNode == null) {
            return;
        }
        printMid(treeNode.left);
        System.out.print(treeNode.data + ",");
        printMid(treeNode.right);
    }

    private void printPost(TreeNode treeNode){
        if(treeNode == null) {
            return;
        }
        printPost(treeNode.left);
        printPost(treeNode.right);
        System.out.print(treeNode.data + ",");
    }
}
