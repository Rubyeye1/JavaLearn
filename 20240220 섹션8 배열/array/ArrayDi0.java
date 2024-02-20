package array;

import java.util.Scanner;

public class ArrayDi0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] arr = new int[a][b];

        for (int i=0; i<a; i++) {
            for (int j=0; j< arr[i].length;j++){
                int temp = scanner.nextInt();
                arr[i][j] = temp;
            }
        }

        for (int row=0; row<a; row++){
            for (int column=0; column<arr[row].length; column++) {
                System.out.println(arr[row][column]);
            }
        }
    }
}
