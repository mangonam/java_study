package chapter08_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {

        ClassA classA1 = new ClassA();
    //  클래스명 객체명 = new 클래스명();


        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        classA1.name = scanner.nextLine();

        System.out.print("나이를 입력하세요 >>> ");
        classA1.num = scanner.nextInt();

        System.out.println("classA2의 이름은 "+classA1.name+"이고, 나이는 "+classA1.num+"입니다. 이번 학기 점수는 "+classA1.score+"점 입니다.");



        classA1.callName();

    }
}
