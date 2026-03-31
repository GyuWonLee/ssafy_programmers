
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int hanyang = A + C;
        int yongdap = B + D;

        if (hanyang < yongdap) {
            System.out.println("Hanyang Univ.");
        } else if (hanyang > yongdap) {
            System.out.println("Yongdap");
        } else {
            System.out.println("Either");
        
        }    
    }
    
}