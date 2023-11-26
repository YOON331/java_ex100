package java_ex100;
import java.util.Scanner;
import java.math.*;

public class ex100_53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int max = num1 + num2;
		int sub = 0;
		int mul = num1* num2;
		int div = 0;
		int pow = 0;
		
		if((num1 - num2) >= (num2 - num1)) {
			sub = num1 - num2;
		} else {
			sub = num2 - num1;
		}
		if (((int) num1 / num2) >= ((int) num2 / num1)) {
			div = (int) num1 / num2;
		} else {
			div = (int) num2 / num1;
		}
		
		if( ((int)  Math.pow(num1, num2)) >= ((int)  Math.pow(num2, num1))) {
			pow = (int)  Math.pow(num1, num2);
		} else {
			pow = (int)  Math.pow(num2, num1);
		}
		
		if(max < sub) {
			max = sub;
			if(max < div) {
				max = div;
				if(max < pow) {
					max = pow;
				}
			}
			if(max < pow) {
				max = pow;
			}
		} else {
			if(max < div) {
				max = div;
				if(max < pow) {
					max = pow;
				}
			}
			if(max < pow) {
					max = pow;
			}
		}
		
		System.out.printf("%f", (float) max);
		
	}

}
