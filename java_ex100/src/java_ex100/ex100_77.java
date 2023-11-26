package java_ex100;
import java.util.Scanner;

public class ex100_77 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fac = 1;
		
		for(int i = num; i > 0; i--) {
			fac *= i;
		}
		System.out.println(fac);

	}

}
