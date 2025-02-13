package chapter11_arrays;
/*
    일반 변수 : 데이터를 직접 가지는 변수
        byte, short, int, double 등 기본데이터 타입(자료형)을 가지는 경우
    참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나
        변경하는 경우
        String, 배열, 객체(클래스), Collections -> Collections는 추후 수업 예정
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr2);

        // 문자열 데이터를 변수에 저장하는 방법
        String strExample1 = "안녕하세요";
        //객체 생성 방식
        String strExample2 = new String("안녕하세요");
        System.out.println(strExample1);
        System.out.println(strExample2);

        if(strExample1=="안녕하세요") {
            System.out.println("실행1");
        }
        if(strExample2=="안녕하세요") {
            System.out.println("실행2");
        }

        if(strExample2.equals("안녕하세요")) {
            System.out.println("실행3");
        }
        int[] arr03 = {10,20,30,40};

        System.out.println(arr03[0]);
        System.out.println(arr03[1]);
        System.out.println(arr03[2]);
        System.out.println(arr03[3]);


        //이상의 코드를 봤을때 sout 실행문이 반복되는 것처럼 보입니다 -> 반복문 적용이 가능
        int[] arr04 = {10,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < 11; i++) {
            System.out.println(arr04[i]);
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println(arr04[j]);
        }
        for (int k = 0; k < 11; k++) {
            System.out.println(arr04[k]+1);
        }

    }
}
