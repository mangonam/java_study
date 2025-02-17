package chapter11_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGame =5;
        int[] lottoNumbers = new int[6];
        boolean duplicate;
        int number;

        for (int j = 0 ; j < totalGame ; j++ ) {
            for (int i = 0 ; i < lottoNumbers.length ; i++) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                for (int k = 0; k < i; k++) {
                    if (lottoNumbers[k] == number) {
                        duplicate=true;
                    }
                }
                if (!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }

}