package link;

/**
 * 删除链表倒数第 n个结点.
 * 最简单和直接的方法就是先遍历一次链表取得链表长度len，然后再次表头开始遍历至第len-n个结点并将该结点删除即可，
 * 这种方法是可行的，不过效率不高（遍历了两次），因此应当考虑可否遍历一次即完成任务。
 * 比较有效率的是快慢指针法：定义两个指针，快
 */
public class DeleteNode {

    public void testDel(){
        SingleLink sl = new SingleLink();
        sl.add(1);
        sl.add(2);
        sl.add(3);
        sl.add(4);
        sl.add(5);
        sl.printAll();
        deleteNode(sl.header,3);
        System.out.println("删除后：");
        sl.printAll();
    }

    public void deleteNode(Node head, int n) {
        Node p = head;
        Node fast = head;

        for(int i=0; i< n+1; i++){
            if(fast == null){
                return;//说明n值不合法
            }
            fast = fast.next;
        }

        while(fast != null){
            p = p.next;
            fast = fast.next;
        }
        p.next = p.next.next;
    }
}
