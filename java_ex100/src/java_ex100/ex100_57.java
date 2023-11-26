package java_ex100;
import java.util.Scanner;

public class ex100_57 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int select1 = scan.nextInt();
		int select2 = scan.nextInt();
		
		int cal = 0;
		
		switch (select1) {
			case 1: {
				cal += 400;
				break;
			}
			case 2: {
				cal += 340;
				break;
			}
			case 3: {
				cal += 170;
				break;
			}
			case 4: {
				cal += 100;
				break;
			}
			case 5: {
				cal += 70;
				break;
			}
		}
		
		switch (select2) {
			case 1: {
				cal += 400;
				break;
			}
			case 2: {
				cal += 340;
				break;
			}
			case 3: {
				cal += 170;
				break;
			}
			case 4: {
				cal += 100;
				break;
			}
			case 5: {
				cal += 70;
				break;
			}
		}
		if(cal > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");
		}

	}

}
