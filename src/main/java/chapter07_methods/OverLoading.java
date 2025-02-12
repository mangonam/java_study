package chapter07_methods;
/*
    method overloading
    매개변수의 형태가 다르면 동일한 메서드 명을 가지고 정의 할 수 있다,

    즉,메서드 명은 동일하고, parameter에 들어가는 자료형 및 변수명을 달리 사용이 가능함.

    overloading의 장점 :
        동일한 기능을 하는 메서드를 정의할때 메서드명이 필요한데,
        예를 들어 String자료형끼리 연결해주는 메서드와
        int끼리 합 연산을 하는 메서드를 나누었을때,
        그리고 double끼리 합 연산을 하는 메서드를 나누었을때,
        add
        plus
        connect

        add(int a, int b....., int n)으로 정의 한다고 할때
        n의 개수가 고정되있지 않으면 항상 오류가 발생한다는 문제점이 있을 겁니다.
 */
public class OverLoading {
    public static void add() {
        System.out.println("add()");
    }
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a+b="+(a+b));
    }
    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s+"/"+a);
    }
    public static void add(int a, String s) {
        System.out.println("add(String s, int a)");
        System.out.println(a+"/"+s);
    }

    public static void main(String[] args) {
        add();
        add(1,2);
        add("안녕하세요");
        add("안녕하세요",1234);
        add(1234, "안녕하세요");
    }
}
