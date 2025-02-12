package chapter05_condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        if (score>=90 && score<=100) {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 A학점입니다");
        }
        else if (score>=80 && score <= 89) {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 B학점입니다");
        }
        else if (score>=70 && score <= 79) {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 C학점입니다");
        }
        else if (score>=60 && score <= 69) {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 D학점입니다");
        }
        else if (score>=0 && score<=59) {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 F학점입니다");
        }
        else {
            System.out.println("입력한 점수는 "+ score +" 점이며, 학점은 X학점입니다");
        }
    }
}
