package java_ex100;
import java.util.Scanner;

public class ex100_49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min >= 30) {
			min -= 30;
		} else {
			if(hour > 0) {
				hour -= 1;
				min += 30;
			} else {
				hour = 23;
				min += 30;
			}
			
		}
		
		System.out.printf("%d %d\n", hour, min);

	}

}
