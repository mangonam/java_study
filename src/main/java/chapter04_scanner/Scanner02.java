package chapter04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*\
            scanner.next()
            scanner.nextLine()\
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요>>");
        String name = scanner.nextLine();
        System.out.print("주소를 입력하세요>>");
        String address = scanner.nextLine();
        System.out.print("나이를 입력하세요>>");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");
        System.out.println("이름:"+name);
        System.out.println("주소:"+address);
        System.out.println("나이:"+age);
        System.out.println("내년 나이:"+(age+1));

        System.out.println("이름 : "+name + "\n주소 :"+ address +"\n나이:"+age +"\n내년나이:"+(age+1));
    }
}
