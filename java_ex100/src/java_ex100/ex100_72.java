package java_ex100;
import java.util.Scanner;

public class ex100_72 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int numArr[] = new int[num1];
		
		
		for(int i = 0; i < num1; i++) {
			numArr[i] = scan.nextInt();
		}
		
		int max = numArr[0];
		for(int i = 1; i < numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
		}
		System.out.println(max);

	}

}
