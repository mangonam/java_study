package chapter06_loops;

public class Loop03 {
    public static void main(String[] args) {
//        int a;
//        int b;
//
//        for ( int i = 0 ; i<5; i++) {
//            a=i;
//            System.out.println("a의 값 : "+a);
//            for (int j = 0 ; j<5 ; j++) {
//                b=j;
//                System.out.println("b의 값 : "+ b);
//            }
//            System.out.println("----------b가 끝나서 새로 a를 대입합니다---------");
//        }
        int sum;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+"X"+j+ " = " +(i*j));
            }
        }
    }
}
