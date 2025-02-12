package chapter09_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person01 = new Person();


//        person01.name = "이현규";
//        person01.age = 1000;
//
//        System.out.println(person01.age);

        person01.setName("이현규");
        person01.setName("일이삼사 오륙");
        person01.setName("이현규");
        person01.setAge(1000);
        person01.setAge(10);

        System.out.println("제이름은"+person01.getName()+"입니다");
        System.out.println("저는 올해 "+person01.getAge()+"살 입니다. 내년에는"+ (person01.getAge()+1)+"살이 됩니다");
    }
}
