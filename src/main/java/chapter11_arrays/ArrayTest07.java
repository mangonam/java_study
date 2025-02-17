package chapter11_arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        int num=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = ++num;
            }
            System.out.println(Arrays.deepToString(numbers));
        }
    }
}
