package search;

/**
 * 二分查找
 * 应用场景有限，底层必须依赖数组，并且还要求数组是有序的。
 * （对于法分为较小的数组查找，直接顺序遍历即。二分查找更适合处理静态数据，也就是没有频繁的数据插入、删除操作。）
 */
public class MyBinarySearch {
    //自己实现方法,有诸多不足
    public int getIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length;
        int mid = (min + max)/2;

        while (mid>min && mid<max) {
            if(value < arr[mid]) {
                max = mid;
                mid = (min + mid)/2;
            }else if (value > arr[mid]) {
                min = mid;
                mid = mid + (max - mid)/2;
            }else {
                //如果数组中存在重复元素，则将数组的角标往前移。
                while (value == arr[mid-1]){
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归实现（自己实现方法）
     * @param arr
     * @param min
     * @param max
     * @param value
     * @return
     */
    public int getRecIndex(int [] arr, int min, int max, int value) {
        int mid = (min + max)/2;
        while (mid>min && mid<max) {
            if(value < arr[mid]) {
                return getRecIndex(arr,min,mid,value);
            }else if (value > arr[mid]) {
                return getRecIndex(arr,mid,max,value);
            }else {
                //如果数组中存在重复元素，则将数组的角标往前移。
                while (value == arr[mid-1]){
                    mid--;
                }
                return mid;
            }
        }
        return -1;
    }
}
