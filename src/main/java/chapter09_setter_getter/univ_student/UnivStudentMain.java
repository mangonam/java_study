package chapter09_setter_getter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {
        UnivtStudent student01 = new UnivtStudent();

        student01.setName("김일");
        student01.setGrade(1);
        student01.setScore(3.3);

        UnivtStudent student02 = new UnivtStudent("김이");

        student02.setGrade(2);
        student02.setScore(4.0);

        UnivtStudent student03 = new UnivtStudent(3);

        student03.setName("김삼");
        student03.setScore(2.7);

        UnivtStudent student04 = new UnivtStudent("김이",4);

        student04.setScore(3.8);

        UnivtStudent student05 = new UnivtStudent("김오",1,1.0);

        student01.showInfo();
        System.out.println();
        student02.showInfo();
        System.out.println();
        student03.showInfo();
        System.out.println();
        student04.showInfo();
        System.out.println();
        student05.showInfo();




    }
}
