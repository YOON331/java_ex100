package java_ex100;
import java.util.Scanner;

public class ex100_41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if((num >= 30 & num <= 40) || (num >= 60 & num <= 70)) {
			System.out.println("win");
		}else {
			System.out.println("lose");
		}

	}

}
