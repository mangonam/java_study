package chapter08_classes;

public class ScoreCalc {
    public static double addScores(double totalScore, double addedScore) {
        return totalScore + addedScore;
    }

    public static double calculateAvg(double totalScore, int numOfSubjects) {
        return totalScore / numOfSubjects;
    }
}

