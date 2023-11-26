package java_ex100;
import java.util.Scanner;

public class ex100_82 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for(int i= num1; i <= num2; i++ ) {
			for(int j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d\n", i , j , i*j);
			}
		}

	}

}
