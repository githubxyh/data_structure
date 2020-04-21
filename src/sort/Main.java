package sort;

public class Main {

    public static void main(String[] args) {
        int arr[] = {5,1,47,2,3,8};

        //冒泡
        //BubbleSort bs = new BubbleSort();
        //bs.sort(arr);

        //选择排序
        //SelectionSort ss = new SelectionSort();
        //ss.sort(arr);

        //插入排序
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        printAll(arr);

    }

    public static void printAll(int arr[]) {
        for(int v : arr){
            System.out.println(v);
        }
    }
}
