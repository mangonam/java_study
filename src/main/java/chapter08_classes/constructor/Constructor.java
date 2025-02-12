package chapter08_classes.constructor;

public class Constructor {
    int num;
    String name;

    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }
    Constructor(int num) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = num;
    }

    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }

    Constructor(int num, String name) {
        System.out.println("AllArgsConstructor(int , String 매개변수를 필수로 요구하는 생성자)");
        this.num = num;
        this.name = name;
    }
    // String name과, int num을 매개변수로 하는 AllArgsConstructor를 생성하시고,
    // ConstructorMain.java로 가서 contructor3 를 '여러분 이름', '여러분 나이'로 생성한 다음,
    // sout을 통해 여러분 이름과 나이가 출력되도록 작성하시오.

    // constructor0에는 name에 "김일", 나이에 "10" 입력하고 sout을 통해 출력하시오.

    // int num과 String name을 매개변수로 하는 객체를 ConstructorMain.java에 생성하고,
    // 객체명을 constructor4로 생성하는데, num 30, name 김이로 대입하시오.
    // 그리고 sout을 통해 '김이 : 30'이 출력되도록 작성하시오.

    void showInfo() {
        System.out.println("해당 객체의 num 값: "+num);
        System.out.println("해당 객체의 name 값: "+name);
    }

    String showInfo2() {
        return "해당 객체의 num 값 : "+ num + "\n해당 객체의 name값 : " +name;
    }
}
