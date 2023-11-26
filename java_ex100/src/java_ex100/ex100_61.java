package java_ex100;
import java.util.Scanner;

public class ex100_61 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch (op) {
			case '+' : {
				System.out.printf("%d\n", num1+num2);
				break;
			}
			case '-' : {
				System.out.printf("%d\n", num1-num2);
				break;
			}
			case '*' : {
				System.out.printf("%d\n", num1*num2);
				break;
			}
			case '/' : {
				System.out.printf("%d\n", num1/num2);
				break;
			}
		}

	}

}
