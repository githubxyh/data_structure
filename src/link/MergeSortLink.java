package link;

/**
 * 合并两个有序链表
 */
public class MergeSortLink {

    public void testMerge() {
        SingleLink sl = new SingleLink();
        sl.add(2);
        sl.add(3);
        sl.add(5);

        SingleLink sl2 = new SingleLink();
        sl2.add(1);
        sl2.add(6);
        sl2.add(7);

        Node nNode = merge1(sl.header,sl2.header);
        SingleLink.printAll(nNode);
    }

    public Node merge1(Node node1, Node node2) {
        Node newNode = null;

        if(node1 == null || node2 == null) {
            newNode = node1==null?node2:node1;
        }

        Node p1 = node1;
        Node p2 = node2;

        if(p1.data < p2.data){
            newNode = p1;
            p1 = p1.next;//这一步非常重要，否则回出现自己指向自己的next，自己的next指向自己的情况。
        }else {
            newNode = p2;
            p2 = p2.next;//这一步非常重要，否则回出现自己指向自己的next，自己的next指向自己的情况。
        }

        Node current = newNode;
        while (p1 != null && p2 != null) {
            if(p1.data < p2.data){
                current.next = p1;
                p1 = p1.next;
            }else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        if(p1 != null) {
            current.next = p1;
        }

        if(p2 != null) {
            current.next = p2;
        }
        return newNode;
    }
}
