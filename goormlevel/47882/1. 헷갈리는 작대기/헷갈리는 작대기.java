import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int one = 0;
        int upperI = 0;
        int lowerL = 0;
        int bar = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '1') {
                one++;
            } else if (c == 'I') {
                upperI++;
            } else if (c == 'l') {
                lowerL++;
            } else if (c == '|') {
                bar++;
            }
        }

        System.out.println(one);
        System.out.println(upperI);
        System.out.println(lowerL);
        System.out.println(bar);
    }
}
