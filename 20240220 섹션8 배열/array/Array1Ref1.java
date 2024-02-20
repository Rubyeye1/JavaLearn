package array;

import java.util.Scanner;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];
        Scanner scanner = new Scanner(System.in);
        //변수 값 대입
        for (int i=0; i<5;i ++) {
            int temp = scanner.nextInt();
            students[i] = temp;
        }

        for (int i=0; i<5; i++) {
            System.out.println(students[i]);
        }
    }
}
