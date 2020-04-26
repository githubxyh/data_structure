package search;

public class BinarySearch {

    /**
     * 获取数组中指定元素的索引值，出现重复元素时返回第一个出现的索引位置。
     * @param arr
     * @param value
     * @return
     */
    public int getIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length - 1;

        while (min < max) {
            int mid = (min + max)/2;
            if(value < arr[mid]) {
                max = mid - 1;
            }else if (value > arr[mid]) {
                min = mid + 1;
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
     * 获取元素出现的第一个位置的索引值，优化版。
     * @param arr
     * @param value
     * @return
     */
    public int getFirstIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + ((max-min)>>1);
            if(value <= arr[mid]) {
                max = mid - 1;
            }else {
                min = mid + 1;
            }
        }
        if(min < arr.length && arr[min] == value) return min;
        return -1;
    }

    /**
     * 获取元素出现的最后一个索引值。
     * @param arr
     * @param value
     * @return
     */
    public int getLastIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + ((max-min)>>1);
            if(value >= arr[mid]) {
                min = mid + 1;
            }else {
                max = mid - 1;

            }
        }
        if(max < arr.length && arr[max] == value) return max;
        return -1;
    }

    /**
     * 查找第一个大于等于给定值的元素
     * @param arr
     * @param value
     * @return
     */
    public int getFirstGreaterIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + ((max-min)>>1);
            if(value <= arr[mid]) {
                if((mid == 0) || (value > arr[mid - 1])){
                    return mid;
                }
                max = mid - 1;
            }else {
                min = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于给定值的元素索引
     * @param arr
     * @param value
     * @return
     */
    public int getLessIndex(int [] arr, int value) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + ((max-min)>>1);
            if(value < arr[mid]) {
                max = mid - 1;
            }else {
                if((mid == arr.length - 1) || (arr[mid+1]) > value) {
                    return mid;
                }else {
                    min = mid + 1;
                }
            }
        }
        return -1;
    }
}
