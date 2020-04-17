package link;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表的中环检测
 */
public class CheckRing {

    public void testCheckRing(){
        Node head = getRingLink();
        System.out.println(this.checkRing1(head));
        System.out.println(this.checkRing2(head));
    }

    //获取一个患有环形的链表
    public Node getRingLink(){
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = head;//制造链表环
        return head;
    }

    /**
     * 有两个指针p1和p2，同时从头结点往下遍历链表中的所有结点。
     * p1是慢指针，一次遍历一个结点。
     * p2是快指针，一次遍历两个结点。
     * 如果链表中没有环，p1和p2会先后遍历玩所有结点。
     * 如果链表中有环，p1和p2会先后进入环中，一直在循环，并且一定会在某一次遍历中相遇。
     * 因此，我们只要发现了p1和p2相遇了，就可以判断链表中一定存在环。
     * @param head
     * @return
     */
    public boolean checkRing1(Node head) {
        if(head == null) {
            return false;
        }

        Node p = head;//正常指针
        Node fasterP = head;//快慢指针
        while(p != null && fasterP != null) {
            if (fasterP.next == null){
                return false;
            }
            p = p.next;
            fasterP = fasterP.next.next;
            //如果指针相遇
            if(p == fasterP){
                return true;
            }
        }
        return false;
    }

    /**
     * 思路：顺序遍历链表中所有的结点，并将其结点信息都保存下来。如果结点信息出现了两次，则存在环。
     * @param head
     * @return
     */
    public boolean checkRing2(Node head) {
        List<Node> nodeList = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            if(nodeList.contains(temp)){
                return true;
            }
            nodeList.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
