package link;

/**
 * Least Frequently Used(最少使用策略)
 * 维护一个有序单链表，越靠近链表尾部的结点是越早之前访问的。当有一个新的数据被访问时，我们从链表头开始顺序遍历链表。
 */
public class LRULink {

    public Node header = null;
    //缓存中允许存储的最大元素个数
    private int maxSize = 5;
    //当前缓存被占用数量
    private int cacheSize = 0;

    public int get(int data){
        if(header == null) {
            header = new Node(data);
            cacheSize++;
            return data;
        }
        //如果数据已经在头部，直接返回
        if(header.data == data) {
            return data;
        }

        //判断data是否已经在缓存中。
        boolean flag = false;
        Node temp = header;
        while (temp.next != null){
            if(temp.next.data == data) {
                flag = true;
                //将当前元素移动到链表最前面
                Node it = temp.next;
                temp.next = temp.next.next;
                it.next = header;
                header = it;
                break;
            }
            temp = temp.next;
        }

        //如果该元素已经在缓存中，则不需要考虑删除尾部元素，直接返回
        if(flag) {
            return data;
        }
        //如果缓存已经超过最大缓存数量，则需要删除尾部元素。
        if(cacheSize >= maxSize) {
            Node preTail = header;
            Node tail = preTail.next;
            while (tail != null){
                if(tail.next == null) {
                    preTail.next = null;
                    break;
                }
                preTail = preTail.next;
                tail = preTail.next;
            }
        }
        //将新元素添加到链表头部
        Node node = new Node(data);
        node.next = header;
        header = node;
        cacheSize++;
        return data;
    }

    public void printAll(Node node){
        SingleLink.printAll(node);
    }
}
