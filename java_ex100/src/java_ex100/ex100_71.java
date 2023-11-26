package java_ex100;
import java.util.Scanner;
import java.util.Random;

public class ex100_71 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += random.nextInt(9)+1;
		}
		System.out.println(sum);
	}

}
