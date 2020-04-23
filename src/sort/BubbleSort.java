package sort;

/**
 * 冒泡排序：
 * 1)每次都与相邻的元素进行比较。
 * 2)每一轮过后会确定一个元素的位置。
 * 3)每一轮都会比上一轮少比较一次。
 */
public class BubbleSort {

    public void sort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length - i-1; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
