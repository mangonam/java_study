package chapter07_methods;

import java.util.Scanner;

public class Methods02 {
    public static String getstar(int select, int rows) {
        String result = "";
        if (select == 1) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 2) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - 1; j++) {
                    result += " ";
                }
                for (int k = 0; k < i + 1; k++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 3) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 4) {
            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < i - 1; j++) {
                    result += " ";
                }
                for (int k = 0; k < rows + 1; k++) {
                    result += "*";
                }
            }
            result += "\n";
        } else {
            result += "잘못입력하셨습니다. 😂";
        }

            return result;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowOfStars;
        int select;
        String starResult;


        System.out.print("몇줄짜리 별을 생성할까요>");
        rowOfStars = scanner.nextInt();

        System.out.println("왼쪽으로 치우친 증가하는 별");
        System.out.println("오른쪽으로 치우친 증가하는 별");
        System.out.println("왼쪽으로 치우친 감소하는 별");
        System.out.println("오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        select = scanner.nextInt();

        starResult = getstar(select, rowOfStars);
        System.out.println(starResult);
    }
}