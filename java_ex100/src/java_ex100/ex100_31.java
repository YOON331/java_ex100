package java_ex100;
import java.util.Scanner;

public class ex100_31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		if(num > 89) {
			System.out.println("A");
		}
		else if(num > 69) {
			System.out.println("B");
		}
		else if(num > 39) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}
