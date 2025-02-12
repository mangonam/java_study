package chapter06_loops;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        Scanner scanner = new Scanner(System.in);
//        int row = 0;
//        System.out.print("숫자를 입력하세요 >>> ");
//        row = scanner.nextInt();

        for (int i = 5 ; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("😂");
            }
            System.out.println();
        }


        for (int i = 5; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }

        }
    }
}
