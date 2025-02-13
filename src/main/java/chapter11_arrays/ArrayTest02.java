package chapter11_arrays;

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇명의 학생을 등록하시겠습니까? >>> ");
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print((i+1)+" 번 학생 이름 : ");
            names[i]=scanner.nextLine();
        }
        for (int j = 0; j < number; j++) {
            System.out.println((j+1)+"."+names[j]);
        }
    }
}
