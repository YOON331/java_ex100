package java_ex100;
import java.util.Scanner;

public class ex100_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.nextLine().charAt(0);
		
		switch (c) {
			case 'A':
				System.out.println("best!!!");
				break;
			case 'B':
				System.out.println("good!!");
				break;
			case 'C':
				System.out.println("run!");
				break;
			case 'D':
				System.out.println("slowly~");
				break;
			default:
				System.out.println("what?");
				
		}

	}

}
