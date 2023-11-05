package java_ex100;
import java.util.Scanner;

public class ex100_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b < a) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}

	}

}
