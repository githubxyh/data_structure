package link;

/**
 * 合并两个有序链表
 */
public class MergeSortLink {

    public void testMerge() {
        SingleLink sl = new SingleLink();
        sl.add(1);
        sl.add(3);
        sl.add(5);

        SingleLink sl2 = new SingleLink();
        sl2.add(2);
        sl2.add(4);
        sl2.add(6);

        Node nNode = merge1(sl.header,sl2.header);
        Node temp = nNode;
        System.out.println(temp.data);
        while (temp.next != null){
            System.out.println(temp.next.data);
            temp = temp.next;
        }
    }

    public Node merge1(Node node1, Node node2) {
        if(node1 == null) {
            return node2;
        }

        if(node2 == null) {
            return node1;
        }

        Node p1 = node1;
        Node p2 = node2;

        Node newNode = null;

        if(p1.data < p2.data){
            newNode = p1;
        }else {
            newNode = p2;
        }

        while (p1.next != null || p2.next != null) {
            if(p1.next == null) {
                newNode.next = p2.next;
                p2 = p2.next;
                continue;
            }

            if(p2.next == null) {
                newNode.next = p1.next;
                p1 = p1.next;
                continue;
            }

            if(p1.next.data < p2.next.data){
                newNode.next = p1.next;
                p1 = p1.next;
            }else {
                newNode.next = p2.next;
                p2 = p2.next;
            }
        }
        return newNode;
    }
}
