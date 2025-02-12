package chapter09_setter_getter;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("이름의 글자수를 초과했습니다");
        }
        System.out.println("이름을 수정합니다.");
        System.out.println("변경전 이름: " + this.name);
        this.name = name;
        System.out.println("변경후 이름: "+ this.name);
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("불가능한 나이 입력");
        }
        else if (age>200) {
            System.out.println("불가능한 나이 입력");
        }
        else {
            System.out.println("나이가 입력되었습니다");
        }

    }

    public void setInfo(int age, String name) {

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
