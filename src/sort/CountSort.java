package sort;

/**
 * 计数排序
 */
public class CountSort {

    public void sort(int arr[]) {
        if(arr.length == 0){
            return;
        }
        int max = arr[0];
        //找到数组最大值
        for(int v : arr) {
            if(v > max) {
                max = v;
            }
        }
        //创建一个位置是0-max的数组
        int temp[] = new int[max+1];
        //统计每个位置值（temp的位置对应arr数组的值）出现的次数
        for(int k : arr) {
            temp[k] = temp[k]+1;
        }
        //对数组顺序求和，这一步是为了算出temp每个位置比自己小的元素个数。
        for(int i=1; i<temp.length; i++) {
            temp[i] = temp[i] + temp[i-1];
        }
        //创建一个新数组，为了盛放排序后的数组。
        int temp2[] = new int[arr.length];
        for(int j = arr.length - 1; j >= 0; j--) {//这一步从后往前遍历，是为了保证排序的稳定性（相同元素不会调换位置）。
            int v = arr[j];
            int p = temp[v]-1;
            temp2[p] = arr[j];
            temp[v]--;//这一步操作是为了处理重复元素，当下次遇见重复元素时将重复元素往前放。
        }
        //将值赋给原数组
        for(int s=0; s<temp2.length; s++){
            arr[s] = temp2[s];
        }
    }

    public void sort(int arr[], int digit) {
        int max = 0;
        //找到数组最大值
        for(int v : arr) {
            int rv = (v/((int)Math.pow(10,digit))) % 10;
            if(rv > max) {
                max = rv;
            }
        }
        //创建一个位置是0-max的数组
        int temp[] = new int[max+1];
        //统计每个位置值（temp的位置对应arr数组的值）出现的次数
        for(int k : arr) {
            int p = (k/((int)Math.pow(10,digit))) % 10;
            temp[p] = temp[p]+1;
        }
        //对数组顺序求和，这一步是为了算出temp每个位置比自己小的元素个数。
        for(int i=1; i<temp.length; i++) {
            temp[i] += temp[i-1];
        }
        //创建一个新数组，为了盛放排序后的数组。
        int temp2[] = new int[arr.length];
        for(int j = arr.length - 1; j >= 0; j--) {//这一步从后往前遍历，是为了保证排序的稳定性（相同元素不会调换位置）。
            int v = (arr[j]/((int)Math.pow(10,digit))) % 10;
            int p = temp[v]-1;
            temp2[p] = arr[j];
            temp[v]--;//这一步操作是为了处理重复元素，当下次遇见重复元素时将重复元素往前放。
        }

        for(int s=0; s<temp2.length; s++){
            arr[s] = temp2[s];
        }
    }
}
