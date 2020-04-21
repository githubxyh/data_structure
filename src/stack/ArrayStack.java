package stack;

/**
 * 顺序栈
 */
public class ArrayStack {

    private int[] arr = null;
    private int position = 0;

    public ArrayStack(int capacity) {
        this.arr = new int[capacity];
    }

    public void push(int data) {
        if(position > this.arr.length - 1) {
            return;
        }
        arr[position] = data;
        position++;
    }

    public int pop(){
        if(position <= 0){
            return 0;
        }
        int data = arr[position - 1];
        arr[position] = 0;
        position--;
        return data;
    }

    public void testArrayStack() {
        ArrayStack as = new ArrayStack(9);
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);
        as.push(5);
        as.push(6);
        as.push(7);

        for(int i=0; i< 7; i++){
            System.out.println(as.pop());
        }
    }
}
