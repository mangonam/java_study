package chapter09_setter_getter.univ_student;

public class UnivtStudent {
    String name;
    int grade;
    double score;

    public UnivtStudent() {
    }

    public UnivtStudent(String name) {
        this.name = name;
    }

    public UnivtStudent(int grade) {
        this.grade = grade;
    }

    public UnivtStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivtStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        if (grade<1) {
            System.out.println("다시 입력");
        } else if (grade>4) {
            System.out.println("다시 입력");
        }
    }

    public void setScore(double score) {
        this.score = score;
        if (score<0.0) {
            System.out.println("다시 입력");
        } else if (score>4.5) {
            System.out.println("다시 입력");
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }
    void showInfo() {
        System.out.println("이름 : "+name);
        System.out.println("학년 : "+grade);
        System.out.println("점수 : "+score);
    }
}
