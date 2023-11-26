package java_ex100;
import java.util.Scanner;

public class ex100_69 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		int sum = a;
		
		for(int i = 2; i <= n; i++) {
			sum += d;
		}
		
		System.out.println(sum);

	}

}
