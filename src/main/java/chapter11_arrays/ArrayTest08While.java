package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08While {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGame =5;
        int[] lottoNumbers = new int[6];
        boolean duplicate;
        int number;

        int j = 0 ;
        while (j < totalGame) {
            int i = 0 ;
            while (i < lottoNumbers.length) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                int k = 0;
                while (k < i) {
                    if (lottoNumbers[k] == number) {
                        duplicate=true;
                    }
                    k++;
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
                i++;
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            j++;
        }
    }
}
