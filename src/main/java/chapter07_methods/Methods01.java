package chapter07_methods;

import java.util.Scanner;

public class Methods01 {
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    public static void call2(String strExample) {
        System.out.println("[ o | x ]");
        System.out.println("오늘의 다짐 : " + strExample);
    }

    public static String call3() {
        System.out.println("[ x | o ]");

        String result = "";

        for (int i = 0 ; i < 3 ;i++) {
            for (int j = 0; j < i+2; j++) {
                result += "*";
            }
        }
        result += "\n";
        return result;
    }

    public static String call4(int year,int month ,int date, String day) {
        System.out.println("[ o | x ]");
        return year + "년 " + month + "월 " + date +"일 "+day+"요일";
    }
    /*
        함수형 프로그래밍:
            메서드1의 return값이 메서드2의 argument가 되고, 메서드 2의 return값이 메서드3의 argument가 되는 방식으로,

            첫번째 매서드부터 마지막 메서드까지의 흐름을 통해
            프로그램이 이러지는 방식을 의미함.
     */
    public static String introduce(String name, int age) {
        return ("제 이름은 " + "이고. 나이는 "+age+"살입니다. 내년에"+(age+1)+"살입니다.");
    }


    public static void main(String[] args) {
        call1();
        call2("공부하기😭😭😭😭😭😭");
        String a = call3();
        System.out.println(a);
        call4(2025, 2, 5, "수");
        System.out.println(call4(2025 ,2, 5 ,"수"));
        String date = call4(2025 ,2, 5 ,"수");
        System.out.println(date);


        Scanner scanner = new Scanner(System.in);

        String myName ="";
        int myAge = 0;

        System.out.print("이름을 입력하세요 >>> ");
        myName = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        myAge = scanner.nextInt();

    }
}
