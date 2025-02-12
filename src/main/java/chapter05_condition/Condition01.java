package chapter05_condition;

public class Condition01 {
    /*
        조건문
        1. if문:if 다음에 있는  ()내의 조건식이 true일 때, {}내의 실횅문이 실행됨. false면 안됨

        형식:
        if(조건식) {
            실행문1
        } else {    else의 경우 if가 false경우에만 실행>>조건식 X
            실헹문2
        }
     */
    public static void main(String[] args) {
        int num = 10;
        if (num>0) {
            System.out.println("num은 양수 입니다.");
        }


        if (num>0) {
            System.out.println("num은 양수 입니다.");
        } else {
            System.out.println("num은 0이거나 음수입니다.");
        }
    }
}
