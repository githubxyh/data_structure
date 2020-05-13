package backtrack;

/**
 * 八皇后问题：我们有一个 8x8的棋盘，希望往里放8个棋子（皇后），每个棋子所在的行、列、对角线都不能有另一个棋子。
 * 一共有92中放法。
 */
public class EightQueens {

    int position[] = new int[8]; //数组下标标识行，元素值表示列。
    public int count = 0; //解的个数

    public void cal8queens(int row) {
        if(row == 8) {
            count++;
            printQueens(position);
            return;
        }
        //每第一行的8种放法。
        for(int column=0; column < 8; column++) {
            if(isOk(row,column)) {
                position[row] = column;
                cal8queens(row + 1);
            }
        }
    }

    /**
     * 检查的时候注意：只检查(row,column)左上方即可。
     * @param row
     * @param column
     * @return
     */
    public boolean isOk(int row,int column) {
        int leftUp = column - 1;
        int rightUp = column + 1;

        //从当前行开始，一行一行向上检查。
        for(int i=row-1; i>=0; i--) {
            if(position[i] == column) {
                return false;
            }
            if(leftUp >= 0 && position[i] == leftUp) {
                return false;
            }

            if(rightUp < 8 && position[i] == rightUp) {
                return false;
            }
            --leftUp;
            ++rightUp;
        }
        return true;
    }

    private void printQueens(int[] result) { // 打印出一个二维矩阵
         for (int row = 0; row < 8; ++row) {
             for (int column = 0; column < 8; ++column) {
                 if (result[row] == column) {
                     System.out.print("Q ");
                 }else {
                     System.out.print("* ");
                 }
             }
             System.out.println();
         }
         System.out.println();
    }
}
