package chapter04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("올해 년도를 입력하세요 >>> ");
//        int year = scanner.nextInt();
//        System.out.println(year);
        String year1= scanner.nextLine();
        System.out.println("올해 년도는 "+year1+"입니다.");
        System.out.println("올해 년도는 "+year1+1+"입니다.");
    }
}
