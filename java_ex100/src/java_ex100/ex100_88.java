package java_ex100;
import java.util.Scanner;

public class ex100_88 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += (i *(i+1)) / 2;
		}
		
		System.out.println(sum);
	}

}
