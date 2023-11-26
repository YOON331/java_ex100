package java_ex100;
import java.util.Scanner;

public class ex100_52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		
		if(num.length() == 1 & num.charAt(0) == '1') {
			num = num+"st";
		} else if(num.length() == 1 & num.charAt(0) == '2') {
			num = num+"nd";
		} else if(num.length() == 1 & num.charAt(0) == '3') {
			num = num+"rd";
		} else if(num.length() == 1 ) {
			num = num+"th";
		} else if(num.length() == 2 & num.charAt(0) == '1') {
			num = num+"th";
		} else {
			if( num.charAt(1) == '1') {
				num = num + "st";
			} else if (num.charAt(1) == '2' ) {
				num = num + "rd";
			} else if (num.charAt(1) == '3' ) {
				num = num + "nd";
			} else {
				num = num + "th";
			}
		}
		System.out.println(num);

	}
}
