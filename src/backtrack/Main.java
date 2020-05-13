package backtrack;

public class Main {

    public static void main(String[] args) {
        //八皇后问题
        EightQueens eq = new EightQueens();
        eq.cal8queens(0);
        System.out.println(eq.count);
    }

}
