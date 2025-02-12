package chapter04_scanner;

import java.util.Scanner;

public class Scanner04BmiCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 키를 입력하세요>>>");
        double height = scanner.nextDouble();
        height = height /100;
        System.out.print("당신의 몸무게를 입력하세요>>>");
        double weight = scanner.nextDouble();
        int bmi = (int)(weight/(height*height));
        if (bmi>18 && bmi<=23) {
            System.out.println("당신의 bmi 지수는 " + bmi +"이고 정상체중입니다.");
        } else if (bmi>23 && bmi<=25) {
            System.out.println("당신의 bmi 지수는 " + bmi +"이고 과체중 입니다.");
        } else if (bmi>25) {
            System.out.println("당신의 bmi 지수는 " + bmi +"이고 비만 입니다.");
        } else if (bmi<=18) {
            System.out.println("당신의 bmi 지수는 " + bmi +"이고 저체중 입니다");
        } else {
            System.out.println("잘못입력되었습니다.");
        }
    }
}
