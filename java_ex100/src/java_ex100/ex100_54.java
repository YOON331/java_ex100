package java_ex100;
import java.util.Scanner;

public class ex100_54 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.printf("%d * %d = %d\n", num2, num1/num2, num1);
		} else if ( num2 % num1 == 0) {
			System.out.printf("%d * %d = %d\n", num1, num2/num1, num2);
		} else {
			System.out.println("none");
		}

	}

}
