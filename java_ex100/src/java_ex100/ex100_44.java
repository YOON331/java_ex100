package java_ex100;
import java.util.Scanner;
public class ex100_44 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		if(day == 2 || day == 4 || day == 6) {
			System.out.println("enjoy");
		}else {
			System.out.println("oh my god");
		}
		
	}
}
