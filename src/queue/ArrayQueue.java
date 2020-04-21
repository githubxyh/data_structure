package queue;

/**
 * 基于数组实现队列。
 */
public class ArrayQueue {

    private int[] arr = null;
    private int head;
    private int tail;

    public ArrayQueue(int size) {
        arr = new int[size];
    }

    public void enqueue(int data) {
        if(tail > arr.length - 1){
            if(head != 0) {//如果队列前面还有空位，将已存在的数据整体往前移
                for(int i= head; i<tail; i++) {
                    arr[i-head] = arr[i];
                }
                tail = tail-head;
                head = 0;
            }else {
                System.out.println("队列已满.");
                return;
            }
        }
        arr[tail] = data;
        tail++;
    }

    public int dequeue(){
        if(head > arr.length - 1) {
            System.out.println("队列中已经没有元素。");
            return 0;
        }
        int data = arr[head];
        head++;
        return data;
    }

    public static void testArrayQueue() {
        ArrayQueue aq = new ArrayQueue(3);
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.dequeue();
        aq.enqueue(4);
        aq.dequeue();
        aq.enqueue(5);
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
        System.out.println(aq.dequeue());
    }
}
