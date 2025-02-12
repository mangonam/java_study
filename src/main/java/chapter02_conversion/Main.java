package chapter02_conversion;

import javax.xml.transform.sax.SAXSource;

public class Main {
    public static void main(String[] args) {
        /*
            형변환:용량 변경 문제로 일어나는 이슈를 해결하기 위해서 사용

            1)업캐스팅 : 더큰 용량의 자료형으로 변환시키는 것

         */
        char cast1 = 'A';
        System.out.println("원형 :"+ cast1);
        System.out.println("변형:"+(int) cast1);
        char cast2 = 'a';
        System.out.println("원형 :"+ cast2);
        System.out.println("변형:"+(int) cast2);

        char cast3 = 'b';
        int cast4 = (int) cast3;
        System.out.println("원형:"+cast3);
        System.out.println("변형:"+cast4);
        // 2)다운캐스팅:더 적은 용량의 자료형으로 변환시키는 것
        int cast5 =99;
        int cast6 =100;
        System.out.println("원형 :"+ cast5);
        System.out.println("변형:"+(char)cast5);
        System.out.println("원형 :"+ cast6);
        System.out.println("변형:"+(char)cast6);
        /*
            upcasting의 경우 메모리 용량이 커지기만 하는 거기 때문에 기본적으로 '암시적'으로 변형 가능
            downcasting의 경우 용량이 적어지기 때문에 메모리 용량을 벗어나게 되는 경우가 있습니다.

         */
    }
}
