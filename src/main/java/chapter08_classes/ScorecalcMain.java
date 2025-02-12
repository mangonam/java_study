package chapter08_classes;

import java.util.Scanner;

import static chapter08_classes.ScoreCalc.addScores;

public class ScorecalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalc scoreCalc = new ScoreCalc();

//        double totalScore = ScoreCalc.addScores(100,100);
//        System.out.println(totalScore);
//
//        double avgScore = ScoreCalc.calculateAvg(totalScore,2);
//        System.out.println(avgScore);
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        double avgScore = 0;
        int totalSubs = 1;
        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            // score1 = -1이 대입되었다면 반복문이 종료되어야 하므로 조건문 작성
            if(score1 == -1) {  // 굳이 '종료'라든지 'x'라든지 이런게 아니라
                break;          // -1을 입력했을 때 종료되게끔 코드를 작성해야만 할까요?
            }
            totalScore = ScoreCalc.addScores(totalScore, score1);

            avgScore=ScoreCalc.calculateAvg(totalScore, totalSubs);
            System.out.println("----------점수 입력시 마다 나오는 합계와 평균----------");
            System.out.println("입력한 점수의 합계 : "+totalScore);
            System.out.println("입력한 점수의 평균 : "+avgScore);

            totalSubs++;


        }
        System.out.println("-------------최종 합계와 평균-----------------");
        System.out.println("최종 점수의 합계 : "+totalScore);
        System.out.println("최종 점수의 평균 : "+avgScore);
    }

}
