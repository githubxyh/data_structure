package sort;

/**
 * 快速排序：
 * 找到一个基准值，然后比基准值小的放左边；比基准值大的放右边。
 * 先将数组进行分割，分割之后再组合。递归进行。
 */
public class QuickSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int start, int end) {
        if (start < end) {
            //将数组分为两部分
            int pivot = partition(arr, start, end);
            //递归排序左子数组
            sort(arr, start, pivot - 1);
            //递归排序右子数组
            sort(arr, pivot + 1, end);
        }
    }

    /**
     * 基准值左边的都比基准值小，右边的都比基准值大
     * @param arr
     * @param start
     * @param end
     * @return
     */
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
