package chapter0_basic;
// 주석(comment) : 한 줄 주석을 위해서는 // 누르기
/*
    다중주석(multiple comment):다중 주석을 위해서는 이사이에 작성했을때 전체가 주석 처리가 됨

    주석이란?
    자바 프로그램의 경우 폴더 및 파일 전체의 코드를 컴파일링 하는데,거기서 오류가 하나라도 발견되면 실행자체가 되지 않음
    하지만 주석처리를 한 부분은 코드로 인식되지 않기 때문에 오류가 발생안됨

     즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라, 사람이 읽어서 정보를 얻을 수 있도록 하는 데에 의의가 있습니다.

     1)한 줄 주석://
     2)다중 주석: / + shift + 8
     3)사루주석) 주석 처리한 부분를 드래그한 후 ctrl+/

     프로젝트/패키지/클래스
        프로젝트 :패키지들이 모여있는 가장 큰 사이즈이며 주로 프로그램 하나를 의미함
        패키지:클래스들이 모여있는 일종의 디렉토리 ->소문자로 작성
        클래스 :파일 단위로 코드를 작성하는 공간->이름 첫글자 대문자
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, java!");



        System.out.println(1); //1
        System.out.println("1"); //1
        System.out.println("1"+"2"); //12
        System.out.println(1+2); //3
        System.out.println(2+1); //3
        System.out.println("2"+"1"); //21

    }
}
