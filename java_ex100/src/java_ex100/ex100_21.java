package java_ex100;
import java.util.Scanner;
import java.math.*;

public class ex100_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int tmp = (int) Math.pow(2, b);
		int k = a * tmp;
		
		System.out.println(k);
	}

}
