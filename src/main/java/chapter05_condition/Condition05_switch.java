package chapter05_condition;

import java.util.Scanner;

public class Condition05_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seleted =null;

        System.out.println("[선택프로그램]");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.print("메뉴를 선택하세요 >>> ");
        seleted = scanner.nextLine();


        switch (seleted) {
            case "a":
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못된 입력");
        }
    }
}
