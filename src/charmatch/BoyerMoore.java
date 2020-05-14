package charmatch;

/**
 * 字符串匹配中的bm算法分为“坏字符”法和“好后缀”法。
 */
public class BoyerMoore {

    protected static final int SIZE = 256;

    protected void generateBC(char[] b, int[]bc) {
        for (int i=0; i<SIZE; i++) {
            bc[i] = -1;
        }
        for (int i=0; i<b.length; i++) {
            bc[(int)b[i]] = i;//以数组b中字符串的ASCII值作为数组下标，以字符串在b中位置作为值(重复的会覆盖，只保留最大的值)，存放在bc数组中。
        }
    }

    protected void generateBC(char[] b, int m, int[]bc) {
        for (int i=0; i<SIZE; i++) {
            bc[i] = -1;
        }
        for (int i=0; i<m; i++) {
            bc[(int)b[i]] = i;//以数组b中字符串的ASCII值作为数组下标，以字符串在b中位置作为值(重复的会覆盖，只保留最大的值)，存放在bc数组中。
        }
    }
}
