public class Main {
    public static void main(String[] args) {
        // 서울의 오늘 날짜 구하기
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int year = cal.get(java.util.Calendar.YEAR);
        int month = cal.get(java.util.Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더해줌
        int day = cal.get(java.util.Calendar.DAY_OF_MONTH);

        System.out.printf("%04d-%02d-%02d%n", year, month, day);
    }
}