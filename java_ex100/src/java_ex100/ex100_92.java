package java_ex100;
import java.util.Scanner;

public class ex100_92 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];

		for(int i = 0; i < 10; i++) {
			arr[i] = scan.nextInt();
		}
		
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
		System.out.printf("%d번째의 숫자는 무엇인가요? \n", num);
		int guess = scan.nextInt();
		System.out.printf("%d번째 숫자는 %d입니다.\n", num, arr[num-1]);
		
	}

}
