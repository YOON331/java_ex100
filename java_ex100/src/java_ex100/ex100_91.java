package java_ex100;
import java.util.Scanner;

public class ex100_91 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		

		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for(int k = 0; k < num-1; k++) {
			for(int i = 0; i < 1; i++) {
				int tmp = arr[0];
				for(int j = 0; j < arr.length -1; j++) {
					arr[j] = arr[j+1];
				}
				arr[ arr.length -1] = tmp;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%d ", arr[i]);
			}
			System.out.println();
		}
		
		

	}

}
