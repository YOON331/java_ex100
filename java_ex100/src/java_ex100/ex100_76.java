package java_ex100;
import java.util.Scanner;
import java.math.*;

public class ex100_76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = (int) Math.pow(num1, num2);
		
		System.out.println(result);

	}

}
