package search;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,6,6,7,8,9,11,15,32,34};
        //MyBinarySearch bs = new MyBinarySearch();
        //int index = bs.getIndex(arr,32);
        //int index = bs.getRecIndex(arr,0,arr.length,32);

        BinarySearch bs = new BinarySearch();
        //int index = bs.getFirstIndex(arr,6);
        //int index = bs.getLastIndex(arr,6);
        //int index = bs.getFirstGreaterIndex(arr,6);
        //int index = bs.getLessIndex(arr,10);
        //System.out.println(index);

        System.out.println(IPUtil.ip2Int("123.126.22.110"));
        System.out.println(IPUtil.int2Ip(2071860846));
    }
}
