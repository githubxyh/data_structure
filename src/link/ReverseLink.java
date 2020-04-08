package link;

/**
 * 反转链表的两种方式：
 * 1.链表反转+顺序
 * 2.链表不动+逆序打印
 */
public class ReverseLink {

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

    //链表不动+逆序打印
    public void reverse2(SingleLink sl){

    }
}
