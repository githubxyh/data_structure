package backtrack;

/**
 * 我们可以把物品依次排列，整个问题就分解为了 n 个阶段，每个阶段对应一个物品怎么选择。
 * 先对第一个物品进行处理，选择装进去或者不装进去，然后再递归地处理剩下的物品。
 */
public class Pack {

    public static void main(String[] args) {
        int[] items = {20,40,50,70};
        f(0, 0, items, items.length, 80);
    }

    public static int maxW = Integer.MIN_VALUE;//存储背包中物品总重量的最大值
    // cw表示当前已经装进去的物品的重量和；
    // i表示考察到哪个物品了；
    // w背包重量；items表示每个物品的重量；
    // n表示物品个数
    // 假设背包可承受重量100，物品个数10，物品重量存储在数组a中，那可以这样调用函数：
    // f(0, 0, a, 10, 100)
    public static void f(int i, int cw, int[] items, int n, int w) {
        if (cw == w || i == n) { // cw==w表示装满了;i==n表示已经考察完所有的物品
            if (cw > maxW) maxW = cw;
            if(i==n) {
                System.out.println(cw);//打印符合条件的重量，重量最大的值是我们想要的。
            }
            return;
        }
        f(i+1, cw, items, n, w);
        if (cw + items[i] <= w) {// 已经超过可以背包承受的重量的时候，就不要再装了
            f(i+1,cw + items[i], items, n, w);
        }
    }
}
