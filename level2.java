import java.util.Scanner;
public class level2 {
    public static void main(String[] args) {
        System.out.print("请输入所需要的n矩阵的阶数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row_number = n;
        int column_number = n;
        System.out.println("随机生成的矩阵A为：");
        int a[][] = new int[row_number][column_number];
        for (int i = 0; i <= row_number - 1; i++) {
            for (int j = 0; j <= column_number - 1; j++) {
                a[i][j] = random_number();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("随机生成的矩阵B为：");
        int b[][] = new int[row_number][column_number];
        for (int f = 0; f <= row_number - 1; f++) {
            for (int m = 0; m <= column_number - 1; m++) {
                b[f][m] = random_number();
                System.out.print(b[f][m] + " ");
            }
            System.out.println();
        }
        int arow = n;
        int brow = n;
        int bcol = b[0].length;
        int[][] c = new int[arow][bcol];
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < bcol; j++) {
                int result = 0;
                for (int k = 0; k < brow; k++) {
                    result += a[i][k] * b[k][j];
                }
                c[i][j] = result;
            }
        }
        System.out.println("相乘后的对称矩阵：");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        int x = 0;
        System.out.println("此矩阵对角线的和为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i == j) {
                    x += c[i][j];
                }
        }
        System.out.println(x);
    }
    public static int random_number() {
        int number = new java.util.Random().nextInt(10) + 1;
        return number;
    }
}






