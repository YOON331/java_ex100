package java_ex100;
import java.util.Scanner;

public class ex100_36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for(int i = 1; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.printf("%d %d\n", i, j);
			}
		}
	}

}
