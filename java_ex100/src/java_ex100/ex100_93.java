package java_ex100;
import java.util.Scanner;

public class ex100_93 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[7];
		
		String tmp = scan.nextLine();
		arr = tmp.split(" ");

		try {
			Thread.sleep(3000); //3초
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			
		}catch(Exception e) { }
		
		int num = scan.nextInt();
		System.out.printf("%d번째의 단어는 무엇인가요? \n", num);
		String guess = scan.next();
		System.out.printf("%d번째 단어는 %s입니다.\n", num, arr[num-1]);
		
	}

}
