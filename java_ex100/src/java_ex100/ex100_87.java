package java_ex100;
import java.util.Scanner;

public class ex100_87 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = num; i >= 1; i -= 2) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i <= num; i += 2) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}