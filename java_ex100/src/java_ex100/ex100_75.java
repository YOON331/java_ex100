package java_ex100;
import java.util.Scanner;

public class ex100_75 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int chk = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				chk = 1;
				break;
			}	
		}
		if(chk == 0) {
			System.out.print("prime");
		} else {
			System.out.println("not prime");
		}
		

	}

}
