package java_ex100;
import java.util.Scanner;

public class ex100_39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println(num3);
			}
			else {
				System.out.println(num2);
			}
		} else if(num2 > num3) {
			if(num3 > num1) {
				System.out.println(num1);
			}
			else {
				System.out.println(num3);
			}
		} else if(num3 > num1){
			if(num1 > num2) {
				System.out.println(num2);
			}
			else {
				System.out.println(num1);
			}
			
		}
		

	}

}
