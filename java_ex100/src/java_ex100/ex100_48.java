package java_ex100;
import java.util.Scanner;

public class ex100_48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String birth = scan.nextLine();
		int gender = scan.nextInt();
		int year;
		if(birth.substring(0, 1) == "0") {
			year = Integer.parseInt(birth.substring(1, 2));
		}else {
			year = Integer.parseInt(birth.substring(0, 2));
		}
	
		int age = 0;
		int baseYear = 2018;
		
		if(gender == 1 || gender == 2 ) {
			year += 1900;
			System.out.println(year);
			age = baseYear - year + 1;
		} else {
			year += 2000;
			if(year < baseYear) {
				age = baseYear - year + 1;
			} else {
				age = year - baseYear + 1;
			}
		}
		
		System.out.println(age);

	}

}
