package link;

/**
 * 链表的中环检测
 */
public class CheckRing {

    public void testCheckRing(){
        Node head = getRingLink();
        System.out.println(this.checkRing1(head));
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


    public boolean checkRing1(Node head){
        if (head == null){
            return false;
        }

        Node p = head;//正常指针
        Node fasterP = head;//快慢指针
        while (p != null && fasterP != null) {
            p = p.next;
            fasterP = fasterP.next.next;
            if (fasterP == null){
                return false;
            }
            //如果指针相遇
            if(p.next == fasterP.next.next){
                return true;
            }
        }
        return false;
    }
}
