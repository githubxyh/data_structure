package sort;

/**
 * 基数排序：将数组中的数，按照个位、十位、百位...等排序
 */
public class RadixSort {

    public void sort(int arr[]) {
        CountSort cs = new CountSort();
        int length = 0;
        for(int i=0; i<arr.length; i++) {
            length = String.valueOf(arr[i]).length();
        }
        for(int j=0; j<=length; j++) {
            cs.sort(arr,j);//此处调用计数排序的特殊方法
        }
    }
}
