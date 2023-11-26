package java_ex100;
import java.util.Scanner;

public class ex100_60 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > 170) {
			if(num2 > 170) {
				if(num3 > 170) {
					System.out.println("PASS");
				} else {
					System.out.printf("CRASH %d\n", num3);
				} 
			} else {
				System.out.printf("CRASH %d\n", num2);
			}
			
		} else {
			System.out.printf("CRASH %d\n", num1);
		}

	}

}
