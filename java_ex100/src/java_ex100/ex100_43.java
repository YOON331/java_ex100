package java_ex100;
import java.util.Scanner;

public class ex100_43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = Integer.toString(scan.nextInt());
		int size = num.length();
		for(int i = 0; i < size;i++) {
			int idx = size - i;
			char tmp = num.charAt(i);
			switch (tmp) {
				case '1' :
					System.out.print("일");
					break;
				case '2' :
					System.out.print("이");
					break;
				case '3' :
					System.out.print("삼");
					break;
				case '4' :
					System.out.print("사");
					break;
				case '5' :
					System.out.print("오");
					break;
				case '6' :
					System.out.print("육");
					break;
				case '7' :
					System.out.print("칠");
					break;
				case '8' :
					System.out.print("팔");
					break;
				case '9' :
					System.out.print("구");
					break;
				case '0' :
					idx = 0;
					break;
			}
			switch (idx) {
			case 1:
				break;
			case 2:
				System.out.print("십");
				break;
			case 3:
				System.out.print("백");
				break;
			case 4: 
				System.out.print("천");
				break;
			case 5:
				System.out.print("만");
				break;
			}
		}
	}

}
