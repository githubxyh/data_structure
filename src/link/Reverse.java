package link;

/**
 * 反转链表的两种方式：
 * 1.链表反转+顺序
 * 2.链表不动+逆序打印
 */
public class Reverse {

    public void testLink(){
        SingleLink sl = new SingleLink();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        Reverse r = new Reverse();
        r.reverse2(sl);
        sl.printAll();
    }

    //链表反转+循环
    public void reverse1(SingleLink sl){
        Node head = sl.header;
        Node prev = null;
        Node current = null;
        while(head != null) {
            current = head;
            head = head.next;
            current.next = prev;
            prev = current;
        }
        sl.header = current;
    }

    //递归反转
    private static Node reverseList(Node node){
        if(node == null || node.next == null){
            return node;
        }
        //链表最后
        Node prev = reverseList(node.next);
        node.next.next = node;
        node.next = null;
        return prev;
    }

    //递归反转
    public void reverse2(SingleLink sl){
        Node head = sl.header;
        sl.header = reverseList(head);
    }
}
