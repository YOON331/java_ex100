package java_ex100;
import java.util.Scanner;

public class ex100_70 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		
		int total = a;
		for(int i = 2 ; i <= n ; i++) {
			total *= r;
		}
		System.out.println(total);
		

	}

}
