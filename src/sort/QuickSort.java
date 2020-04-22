package sort;

public class QuickSort {

    public void sort(int[] arr) {
        qsort(arr, 0, arr.length - 1);
    }

    private void qsort(int[] arr, int start, int end) {
        if (start < end) {
            //将数组分为两部分
            int pivot = partition(arr, start, end);
            //递归排序左子数组
            qsort(arr, start, pivot - 1);
            //递归排序右子数组
            qsort(arr, pivot + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        //基准值
        int pivot = arr[start];
        while (start < end) {
            //从右边找第一个比pivot小的值的位置，然后交换。
            while (start < end && arr[end] >= pivot) {
                end--;
            }
            arr[start] = arr[end];
            arr[end]= pivot;
            //从左边找第一个比pivot大的值的位置，然后交换。
            while (start < end && arr[start] <= pivot) {
                start++;
            }
            arr[end] = arr[start];
            arr[start] = pivot;
        }
        return start;
    }
}
