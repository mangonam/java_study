package chapter07_methods;

import java.net.ProtocolException;
import java.util.Scanner;

public class Methods03 {
    public static String getstar(int totalLine, int menuSelect) {
        String result ="";
        switch (menuSelect) {
            case 1:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += " ";
                    }
                    for (int k =0 ; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < totalLine; i++) {

                    for (int j = 0; j < i - 1; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalLine + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result += "잘못입력하셨습니다. 😂";
        }

        return result;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLine;
        int menuSelect;
        String starResult;


        System.out.print("몇줄짜리 별을 생성할까요>");
        totalLine = scanner.nextInt();

        System.out.println("왼쪽으로 치우친 증가하는 별");
        System.out.println("오른쪽으로 치우친 증가하는 별");
        System.out.println("왼쪽으로 치우친 감소하는 별");
        System.out.println("오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        menuSelect = scanner.nextInt();

        starResult = getstar(totalLine, menuSelect);
        System.out.println(starResult);
    }
}
