package sort;

/**
 * 插入排序：将一个数据插入到已经排好序的有序表中。
 * 通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * 43852617
 * 34852617
 * 34582617
 * 23458617
 * 23456817
 * 12345687
 * 12345678
 */
public class InsertionSort {

    public void sort(int array[]) {
        for(int i=1;i<array.length;i++){   //默认第零个是有序的
            for(int j=i;j>0;j--){          //每次从右边组增加一个数，与左边数据判断，交换位置（左边数据进行排序）
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
}
