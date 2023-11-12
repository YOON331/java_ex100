package java_ex100;
import java.util.Scanner;
import java.math.*;

public class ex100_45 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int d = b*b - 4*a*c;
		
		
		if(d == 0) {
			float x1 = -b + (float) Math.sqrt(d) / 2*a;
			System.out.printf("방정식의 해는 %.2f", x1);
		}else if(d < 0) {
			System.out.println("실근이 없습니다.");
		}else {
			float x1 = (-b + (float) Math.sqrt(d)) / 2*a;
			float x2 = (-b - (float)Math.sqrt(d)) / 2*a;
			System.out.printf("방정식의 해는 %.2f \n방정식의 해는 %.2f", x1, x2);
		}
		
	}

}
