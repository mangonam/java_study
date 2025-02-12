package chapter03_operator;
/*
    논리 연산자

    true(1), false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자룡형

    AND(&&) : 하나라도 false면 false
    OR(||):하나라도 true 면 true
    NOT(!) :값을 반대로 바꿈

 */
public class Operator01 {
    public static void main(String[] args) {

        boolean flag1=true;
        boolean flag2=false;

        boolean result1= flag1 && flag1;
        System.out.println(result1);
        boolean result2= flag1 && flag2;
        System.out.println(result2);
        boolean result3= flag2 && flag2;
        System.out.println(result3);

        boolean result4= flag1 || flag1;
        System.out.println(result4);
        boolean result5= flag1 || flag2;
        System.out.println(result5);
        boolean result6= flag2 || flag2;
        System.out.println(result6);

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println(result7);

        boolean result8 = 10 % 3 == 0;
        System.out.println(result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println(result9);
    }
}
