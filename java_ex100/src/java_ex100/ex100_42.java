package java_ex100;
import java.util.Scanner;

public class ex100_42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if((num >= 50 & num <= 70) || num % 6 == 0) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}

	}

}
