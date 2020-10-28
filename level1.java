import java.util.Arrays;
import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        int[] a = {15, 25, 10, 30, 40, 20, 50};
        for (int c = 0; c < a.length - 1; c++) {
            for (int b = 0; b < a.length - 1 - c; b++) {
                if (a[b] > a[b + 1]) {
                    int temp = a[b];
                    a[b] = a[b + 1];
                    a[b + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后的结果： ");
        for (int x : a
        ) {
            System.out.print(" " + x);
        }
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("请输入一个待插入的数：");

        a[a.length-1]=input.nextInt();
        Arrays.sort(a);

     /*   int num = input.nextInt();
        int index = a.length;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > num) {
                index = i;
                break;
            }
        }
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
            a[index] = num;*/
        System.out.println(Arrays.toString(a));
    }
}

