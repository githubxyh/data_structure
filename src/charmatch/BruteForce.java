package charmatch;

/**
 * Brute Force(BF),中文叫作暴力匹配算法，也叫朴素匹配算法。
 * 我们在主串中，检查起始位置分别是 0、1、2…n-m 且长度为 m 的 n-m+1 个子串，看有没有跟模式串匹配的。
 */
public class BruteForce {

    public int bf(char[] a, char[] b) {
        int n = a.length, m = b.length;
        if(n < m) {
            return -1;
        }

        int i = 0;
        while (i <= n-m) {
            int j;
            for(j = i; j < m + i; j++){
                if(a[j] != b[j-i]) {
                    break;
                }
            }
            if(j == m + i){
                return i;
            }
            i++;
        }
        return -1;
    }
}
