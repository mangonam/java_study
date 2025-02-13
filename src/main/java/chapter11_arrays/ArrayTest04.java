package chapter11_arrays;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args) {
        Random random = new Random();
//        int num = random.nextInt();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(num);
//        System.out.print("임이의 숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);
        int[] arr01 = new int[10];
        for (int i = 0; i < arr01.length; i++) {
            arr01[1] = (i+1);
            System.out.print((i+1)+" ");
        }
        System.out.println();
        for (int num : arr01) {
            System.out.print(num +" ");
        }
        int[] arr02 = {6,7,2,4,3,1};

        Arrays.sort(arr02);

        for (int num : arr02) {
            System.out.println(num + "");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr02));
        Integer[] arr03 = {6,3,7,1,5,4,2,8,9,10};
        Arrays.sort(arr03, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr03));
    }
}
