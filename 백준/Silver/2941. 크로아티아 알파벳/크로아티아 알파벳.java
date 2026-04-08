import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		
		String[] croation = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String str : croation) {
			if(input.contains(str)) {
				input = input.replace(str,"*");
			}
		}
		
		System.out.println(input.length());
	}
}