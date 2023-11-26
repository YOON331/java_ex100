package java_ex100;
import java.util.Scanner;

public class ex100_78 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 =scan.nextInt();
		String op1 = scan.next();
		int num2 = scan.nextInt();
		String op2 = scan.next();
		int num3 = scan.nextInt();
		
		int result = 0;
		switch (op1) {
			case "+": {
				result = num1 + num2;
				break;
			}
			case "-": {
				result = num1 - num2;
				break;
			}
			case "*": {
				result = num1 * num2;
				break;
			}
			case "/": {
				result = num1 / num2;
				break;
			}
		}
		
		switch (op2) {
			case "+": {
				result = result + num3;
				break;
			}
			case "-": {
				result = result - num3;
				break;
			}
			case "*": {
				result = result * num3;
				break;
			}
			case "/": {
				result = result / num3;
				break;
			}
		}
		System.out.println(result);
		

	}

}
