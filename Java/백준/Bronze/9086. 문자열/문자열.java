import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int T = sc.nextInt();

            for (int i = 0; i < T; i++) {
                String s = sc.next();
                
                char first = s.charAt(0);
                char last = s.charAt(s.length() - 1);

                System.out.println(first + "" + last);
            }
        }
        
        sc.close();
    }
}