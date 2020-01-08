import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] course = new double[n]; // 相应课程的学分
        int[] score = new int[n]; // 每门课程实际得分
        double GPA ;
        for (int i = 0; i < n; i++) {
            course[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        int Sumcourse = 0;
        for (int i = 0; i < n; i++) {
            Sumcourse += course[i];
        }

        double Sumscore = 0.0;
        for (int i = 0; i < n; i++) {
            if (score[i] >= 90 && score[i] <= 100) {
                Sumscore += (4.0 * course[i]);
            } else if (score[i] >= 85 && score[i] <= 89) {
                Sumscore += (3.7 * course[i]);
            } else if (score[i] >= 82 && score[i] <= 84) {
                Sumscore += (3.3 * course[i]);
            } else if (score[i] >= 78 && score[i] <= 81) {
                Sumscore += (3.0 * course[i]);
            } else if (score[i] >= 75 && score[i] <= 77) {
                Sumscore += (2.7 * course[i]);
            } else if (score[i] >= 72 && score[i] <= 74) {
                Sumscore += (2.3 * course[i]);
            } else if (score[i] >= 68 && score[i] <= 71) {
                Sumscore += (2.0 * course[i]);
            } else if (score[i] >= 64 && score[i] <= 67) {
                Sumscore += (1.5 * course[i]);
            } else if (score[i] >= 60 && score[i] <= 63) {
                Sumscore += (1.0 * course[i]);
            } else if (score[i] < 60) {
                Sumscore += (0 * course[i]);
            }
        }
        GPA = Sumscore / Sumcourse;
        System.out.printf("%.2f",GPA);
    }
}
