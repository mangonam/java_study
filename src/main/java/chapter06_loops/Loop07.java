package chapter06_loops;

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int n=0;
        boolean isEmpty = true;

        while (isEmpty) {
            System.out.print("n에 들어갈 값을 입력하세요. >>> ");
            n = scanner.nextInt();

            if (n == 0) {
                isEmpty = false;

            }
            System.out.println("n의 값: " + n);
        }
    }
}
