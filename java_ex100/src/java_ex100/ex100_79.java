package java_ex100;
import java.util.Scanner;

public class ex100_79 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String strArr[] = str.split("");
		for(int i =0; i < strArr.length; i++) {
			if(Character.isLowerCase(strArr[i].charAt(0))) {
				strArr[i] = strArr[i].toUpperCase();
			} else {
				strArr[i]= strArr[i].toLowerCase();
			}
		}
		for(int i = 0; i< strArr.length; i++) {
			System.out.print(strArr[i]);
		}

	}

}
