package java_ex100;
import java.util.Scanner;

public class ex100_51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = Integer.toString(scan.nextInt());
		
		if(num.length() >= 3) {
			num = num.substring(num.length()-2, -1);
		}
		String tmp = num.substring(1, 2) + num.substring(0, 1);
		int num1 = Integer.parseInt(tmp) * 2;
		if(num1 > 50) {
			System.out.println(num1);
			System.out.println("OH MY GOD");
		} else {
			System.out.println(num1);
			System.out.println("GOOD");
		}

	}

}
