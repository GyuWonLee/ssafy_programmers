import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalSum = 0;    // (학점 × 과목점수)를 모두 더할 변수
        double totalCredit = 0; // 전체 이수 학점을 더할 변수

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();    // 과목명 (입력은 받지만 계산엔 안 씀)
            double credit = sc.nextDouble(); // 학점 (예: 3.0)
            String grade = sc.next();      // 등급 (예: A+)

            // P(Pass) 등급은 계산에서 아예 제외하고 다음 과목으로 넘어감
            if (grade.equals("P")) {
                continue; 
            }

            // (학점 × 등급점수)를 누적
            totalSum += (credit * getGradePoint(grade));
            // 총 학점 누적
            totalCredit += credit;
        }

        // 최종 계산: (학점×과목점수의 합) / (총 학점)
        System.out.printf("%.6f", totalSum / totalCredit);
        
        sc.close();
    }

    // 등급 문자열을 숫자 점수로 바꿔주는 도우미 함수
    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return 0.0;
        }
    }
}