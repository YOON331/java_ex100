package java_ex100;
import java.util.Scanner;

public class ex100_56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		int oneCount = 0;
		
		if(num1 == 1) {
			oneCount++;
		} 
		if(num2 == 1) {
			oneCount++;
		} 
		if(num3 == 1) {
			oneCount++;
		} 
		if(num4 == 1) {
			oneCount++;
		} 
		
		if(oneCount == 1) {
			System.out.println("도");
		} else if (oneCount == 2) {
			System.out.println("개");
		} else if (oneCount == 3) {
			System.out.println("걸");
		} else if (oneCount == 4) {
			System.out.println("윷");
		} else {
			System.out.println("모");
		}
		

	}

}
