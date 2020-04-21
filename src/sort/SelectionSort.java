package sort;

/**
 * 选择排序：每次都找到最大的元素放在数组的末尾段。
 * 第一轮：找到最大的放在数组的最后位置上。
 * 第二轮：找到导数第二大的放在数组导数第二的位置上。
 */
public class SelectionSort {

    public void sort(int arr[]) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            int temp = arr[i];
            int position = i;
            for (int j=0; j<length -i-1; j++) {
                if(temp < arr[j]){
                    temp = arr[j];
                    position = j;
                }
            }
            arr[position] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
    }
}
