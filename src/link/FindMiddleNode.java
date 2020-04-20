package link;

/**
 * 查找中间节点：快指针走一次走两步，慢指针一次走一步。
 */
public class FindMiddleNode {
    public void testFind() {
        SingleLink sl = new SingleLink();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.add(6);
        sl.add(7);
        Node n = findNode(sl.header);
        System.out.println(n.data);
    }

    public Node findNode(Node head){
        Node p = head;
        Node fast = head;

        while (fast != null) {
            if(fast.next == null) {
                break;
            }
            p = p.next;
            fast = fast.next.next;
        }
        return p;
    }
}
