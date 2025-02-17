package chapter11_arrays;

import java.util.Arrays;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[][] arr03 = {{1,2},{3,4},{5,6}};
        System.out.println(arr03);
        System.out.println(Arrays.toString(arr03));

        for (int[] inArr : arr03) {
            for (int i : inArr) {
                System.out.println(i);
            }
        }
    }
}
