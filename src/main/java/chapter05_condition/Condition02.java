package chapter05_condition;

import java.util.Scanner;

public class Condition02 {
    /*
        3. if - else if - else문 : if - else 문과 달리 else if에는 별도의 조건식이 요구됩니다.
            else if는 반복해서 나타날수 있습니다.

        형식:
        if(조건식1) {
            실행문 1
        } else if(조건식1) {
            실행문 1
        } else {
            실행문 1
        }
     */




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point=0;
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BRONZE = 20;


        if (point>VIP) {
            System.out.println("회원의 등급 : VIP");
        }
        else if (point>GOLD) {
            System.out.println("회원의 등급 : GOLD");
        }
        else if (point>SILVER) {
            System.out.println("회원의 등급 : SILVER");
        }
        else {
            System.out.println("회원의 등급 : BRONZE");
        }
    }
}
