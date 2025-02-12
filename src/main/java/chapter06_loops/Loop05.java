package chapter06_loops;

public class Loop05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
        }
        for (int k = 4; k > 0; k--) {
            System.out.println();
            for (int a = 0; a < k; a++) {
                System.out.print("*");
            }
            

        }
    }
}
