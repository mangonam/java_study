package chapter11_arrays;

public class ArrayTest03EnhancedFor {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i<arr01.length ; i++) {
            System.out.println(arr01[i] + " ");
        }
        for (int j : arr01) {
            System.out.println(j +" ");
        }
        String[] names = {"김일","김이","김삼","김사","김오","김육","김칠"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
