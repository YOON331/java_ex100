package java_ex100;
import java.util.Scanner;

public class ex100_62 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String grade = scan.next();
		String classes = scan.next();
		String num = scan.next();
		
		if(classes.length() <2) {
			classes = "0" + classes;
		}
		if(num.length()<3 & num.length() == 2) {
			num = "0" + num;
		} else if(num.length()<3 & num.length() == 1) {
			num = "00" + num;
		}
		
		System.out.println(grade+classes+num);

	}

}
