package sort;

/**
 * 插入排序：将一个数据插入到已经排好序的有序表中。
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
