import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'C'){
                sum += 3;
            } else if(c >= 'D' && c <= 'F'){
                sum += 4;
            } else if(c >= 'G' && c <= 'I'){
                sum += 5;
            } else if(c >= 'J' && c <= 'L'){
                sum += 6;
            } else if(c >= 'M' && c <= 'O'){
                sum += 7;
            } else if(c >= 'P' && c <= 'S'){
                sum += 8;
            } else if(c >= 'T' && c <= 'V'){
                sum += 9;
            } else if(c >= 'W' && c <= 'Z'){
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}