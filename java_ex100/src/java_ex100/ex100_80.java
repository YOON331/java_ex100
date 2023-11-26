package java_ex100;
import java.util.Scanner;

public class ex100_80 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String strArr[] = str.split("");
		String pass[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
						"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V","W", "X", "Y", "Z"};
		String ans[] = {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
				"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U","V","W"};
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < pass.length; j++) {
				if(strArr[i].equals(pass[j].toLowerCase())) {
					strArr[i] = ans[j].toLowerCase();
				}
			}
			
		}
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}

	}

}
