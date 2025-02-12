package chapter01_variable;
/*
    변수(variable):데이터를 담을 수 있는 바구니
*/
public class Main {
    public static void main(String[] args) {
//        System.out.println(3.1415929204);
//
//        //원의 둘레를 구하는 공식 = 지름 * pi
//        //7번 라인에 있는 원주율을 이용하여 지름이 19인 원의 둘레를 구하시오
//
//        System.out.println(19*3.14159204);
//
//        //자료형 변수명=데이터;
//
//        double pi = 3.14159204;   //변수의 선언 및 초기화
//        // 지름이 23인 원의 둘레를 구하시오\
//        System.out.println(pi*23);
//        int age; //변수선언
//        age=38; //초기화-> 처음으로 변수로 데이터가 대입되는 것을 의미

//        /*
//            Java에서의 변수 표기 방식:
//            카멜 표기법 : 첫 문자는 소문자로 쓰고, 복수의 단어가 연결된 경우에는 두 번째 단어의 첫문자만 대문자로 쓴다
//            ex) 하나 짜리 단어인 경우
//            String example;
//            ex)복수의 단어로 조합된경우
//            String exempleOfKorean
//
//            1. 논리 자료형 변수 : 참 /거짓 -> true /false
//         */
//        boolean checkFlag = false; //변수의 선언 및 초기화
//        System.out.println(checkFlag);
//        checkFlag = true; //이미 선언된 변수은 자료형 적지 않음
//        System.out.println(checkFlag);
//
//        //checkFlag2 = true; => 오류 처음나오는데 자료형을 적지 않아서
//
//        //변수의 선언 및 초기화
//        boolean checkFlag3=true;
//        //변수의 선언 따로 초기화 따로
//        boolean checkFlag4; //변수의 선언
//        checkFlag4 = false; //초기화
//        /*
//            최초로 변수를 선언할때 자료형을 명시하고 값을 대입하여 초기화 함.
//            추후 해당 변수에 값을 재대입하는 경우 변수면= (바뀐)값; 형태로 작성함.
//        */
//        char name1 = '안';
//        char name2 = '근';
//        char name3 = '수';
//        System.out.println(name1+name2+name3);
//        System.out.println(""+name1+name2+name3);
//        /*
//            이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자들이 하나하나 다 지정을 해줘야 함
//            문자와 문자열은 다르고 문자를 세번더하면 더이상 문자가 아니라 문자열로 되어야 합니다.
//
//            지시 사항
//            name4 name5 name6  에 한글자씩 이름 대입하고 콘솔창에 이름출력 되도록
//
//         */
//        char name4 = '이';
//        char name5 = '현';
//        char name6 = '규';
//        System.out.println(""+name4);
//        System.out.println(""+name5);
//        System.out.println(""+name6);


        //3. 정수 자료형 변수
        int width1=100;
        int width2=200;
        System.out.println(width1+ width2);
        /*
            int: 정수를 의미함
            실수에 해당되는 자료형 double

            4.실수 자료형 변수
         */

        double pi=3.14159204;
//        int pi2=3.14159204;
//        int longNum = 12345678912;
        long longNum = 12345678912L;

        //5. 문자열 자료형
        /*
            String : 문자들이 일정한 순서를 지니고 나열된 것을 의미함 (대문자로 시작)
         */
        String name ="이현규";
        int age =15;
        System.out.println("제 이름은"+name+"입니다. 제 나이는"+ (age +1)+ "살입니다");
        //다음주에는 다중라인에 걸친 String을 출력하는법

        /*
            java 17이전>한 String에 한줄씩만 작성 가능
             그러나 java 17부터 다중 String을 지원
         */
/*
            다중 String의 경우 다음주 월요일 이후에 수업하겠습니다.

            int / long

            int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)
            5.상수 > 변수와 반대되는 개념

                특징:
                1)한번의 선언 및 초기화가 가능 > 변수와는 달리 재대입이 불가능
                2)이미 초기화가 끝난 상수를 한참밑에서 불러올 경우 걔가 상수인지 변수 인지 가시적으로
                확인이 불가능 하기 때문에 개발자들끼리 의 약속으로 실수ㅇ는 전부 다 대문자로 작성, 단어외
         */

        /*

         */
    }
}
