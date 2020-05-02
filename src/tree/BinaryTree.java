package tree;

/**
 * 二叉树
 */
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

    //循环添加的另一种实现
    public void add3(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }

        TreeNode p = root;
        while (p != null) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new TreeNode(data);
                    return;
                }
                p = p.right;
            } else { // data < p.data
                if (p.left == null) {
                    p.left = new TreeNode(data);
                    return;
                }
                p = p.left;
            }
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

    /**
     * 删除树节点，分为三种情况：
     * 1.删除叶子节点
     * 2.删除只有一个子节点的节点
     * 3.删除有两个以上节点的节点（需要找到右子节点中最小的节点补充）
     * @param data
     */
    public void delete(int data) {
        TreeNode needDel = findOneNode(data);
        if(needDel == null){
            return;
        }

        TreeNode parent = null;
        TreeNode temp = root;
        while (temp != null) {
            if(data == temp.data) {
                break;
            }
            parent = temp;
            if(data < temp.data) {
                temp = temp.left;
            }else if(data > temp.data) {
                temp = temp.right;
            }
        }

        System.out.println(parent.data + " ## " + needDel.data);

        //如果要删除的节点是叶子节点
        if(needDel.left == null && needDel.right == null) {
            if(parent.left != null && parent.left.data == needDel.data) {
                parent.left = null;
            }

            if(parent.right != null && parent.right.data == needDel.data) {
                parent.right = null;
            }
            return;
        }

        //如果要删除的节点只有一个子节点
        if((needDel.left == null && needDel.right != null) || (needDel.left != null && needDel.right == null)) {
            if(needDel.left != null) {
                parent.right = needDel.left;
            }

            if(needDel.right != null) {
                parent.right = needDel.right;
            }
            return;
        }

        //当要删除的节点有两个子节点时
        if(needDel.left != null && needDel.right != null) {
            TreeNode min = root;
            TreeNode minParent = null;
            while (min.left != null) {
                minParent = min;
                min = min.left;
            }
            needDel.data = min.data;
            minParent.left = null;
            return;
        }
    }

    public int findMax(){
        TreeNode node = findMaxNode(this.root);
        return node == null?-1:node.data;
    }

    public int findMin(){
        TreeNode node = findMinNode(this.root);
        return node == null?-1:node.data;
    }

    //二叉树查找
    public int findOne(int data){
        TreeNode temp = findOneNode(data);
        return temp==null?-1:temp.data;
    }

    public TreeNode findOneNode(int data){
        TreeNode temp = root;
        while (temp != null) {
            if(data == temp.data) {
                return temp;
            }else if(data < temp.data) {
                temp = temp.left;
            }else if(data > temp.data) {
                temp = temp.right;
            }
        }
        return null;
    }

    private TreeNode findMinNode(TreeNode node){
        if(node == null){
            return node;
        }

        TreeNode minNode = node;
        while (minNode.left != null) {
            minNode = minNode.left;
        }

        return minNode;
    }

    private TreeNode findMaxNode(TreeNode node){
        if(node == null){
            return node;
        }

        TreeNode maxNode = node;
        while (maxNode.right != null) {
            maxNode = maxNode.right;
        }
        return maxNode;
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
}
