package chapter06_loops;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {
        /*
            n에 숫자를 입력하여 몆번 반복할지 결정하고
            1부터 n까지 표시하는 반복문을 작성하시오.
         */

        //1. Scanner import
        Scanner scanner = new Scanner(System.in);
        //2.사용할 변수 선언
        int n = 0;
        int a = 0;
        System.out.print("1부터 얿마까지 숫자를 표기하시겠습니까? >>> ");
        n = scanner.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.print(i);
            a += i;

        }
        System.out.println("");
        System.out.println("1부터 "+n+"까지의 값 = "+a);
    }
}
