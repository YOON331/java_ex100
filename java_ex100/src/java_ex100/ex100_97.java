package java_ex100;
import java.util.Scanner;

public class ex100_97 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int students = scan.nextInt();
		int idx = scan.nextInt();
		int arr[]= new int[students];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length-1;i++) {
			for(int j = 0; j < arr.length-i-1;j++) {
				if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
			if(i+1 == idx) {
				System.out.println();
			}
		}
	}

}
