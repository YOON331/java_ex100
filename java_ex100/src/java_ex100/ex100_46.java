package java_ex100;
import java.util.Scanner;

public class ex100_46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 <= 170) {
			System.out.println("CRASH");
		}else {
			System.out.println("PASS");
		}
		if(num2 <= 170) {
			System.out.println("CRASH");
		}else {
			System.out.println("PASS");
		}
		if(num3 <= 170) {
			System.out.println("CRASH");
		}else {
			System.out.println("PASS");
		}
	}

}
