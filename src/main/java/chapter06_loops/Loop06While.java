package chapter06_loops;

public class Loop06While {
    public static void main(String[] args) {
        int n = 0;

        /*
            그래서 for문을 쓸때와 달리 while문을 작성할 때의 유의할 점으로는 :
                    for문은 한계값을 for() 내에 작성하지만
                    while문은 아님,
                    그래서 특정 시점에 조건식이 false가 되게끔 개발자가 사전에 염두해야할 필요성이 있음
         */
        int sum1 = 0;
        int sum2 = 0;
        int j = 0;
        for (int i = 0; i < 5+1; i++) {
            sum1 += i;
        }
        while (j <= 5) {
            sum2 += j;
            j++;
        }
        System.out.println("for 문: " + sum1);
        System.out.println("while 문: " + sum2);

        while (n<100) {
            System.out.print(n+1+" ");
            n++;
            if (n % 10 == 0) {
                System.out.println();
            }
        }


    }
}
