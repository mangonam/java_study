package chapter03_operator;

public class Main {
    public static void main(String[] args) {
//        int i=10;
//        System.out.println(i);
//
//        i=i+1; //변수명 i에 10+1해서 재대입
//        System.out.println(i);
//
//        /*
//            복합 대입 연산자
//            +=,-=,*=,/=
//         */
//        int num=1;
//        System.out.println(num);
//        num+=2;
//        System.out.println(num);
//        num-=1;
//        System.out.println(num);
//        num*=10;
//        System.out.println(num);
//        num/=5;
//        System.out.println(num);
        int j=10;
        System.out.println(j);
        System.out.println(j++); //변수명++ : 코드를 실행시킨 후에 j에 1을 더할것
        System.out.println(++j); //++변수명 : 코드를 실행시킨 후에 j에 1을 더할것
        System.out.println(j--); //변수명-- : 코드를 실행시킨 후에 j에 1을 뺄것
        System.out.println(j);
        System.out.println(--j); //--변수명 : 코드를 실행시킨 후에 j에 1을 뺄것
        /*
            일반 수식 연산자
            +더하기
            -빼기
            *곱하기
            /나누기
            %나머지 연산자
         */
        System.out.println("10/2의 나머지:"+10%2);
    }
}
