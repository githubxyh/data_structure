package charmatch;

public class BMBadChar extends BoyerMoore{

    //bm中的坏字符规则
    public int bm(char[] a, int n, char[] b, int m) {
        int[] bc = new int[SIZE];
        generateBC(b,bc);
        int i = 0;//表示主串与模式串对齐的第一个字符。
        while (i <= n - m) {
            int j;
            for(j = m - 1; j >= 0; --j) {
                if(b[j] != a[i+j]) {
                    break;
                }
            }
            //如果j<0说明模式串已经匹配完了
            if(j < 0){
                return i;
            }
            //a[i+j]表示第一个不匹配的坏字符
            //bc[(int)a[i+j]]代表这个坏字符在模式串(b)中最后出现的位置。
            i = i + (j - bc[(int)a[i+j]]);
        }
        return -1;
    }
}
