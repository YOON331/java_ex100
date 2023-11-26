package java_ex100;
import java.util.Scanner;

public class ex100_73 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int arr[] = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};
		int sum = 0;
		
		sum += arr[num1-1] + arr[num2-1];
		
		System.out.println(sum);
		
	}

}
