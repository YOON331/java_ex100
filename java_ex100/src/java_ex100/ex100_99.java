package java_ex100;
import java.util.Scanner;

public class ex100_99 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		getScore(score);

	}
	
	static void getScore(int score) {
		if(score >= 90) {
			System.out.print("A학점");
		} else if(score >= 80) {
			System.out.print("B학점");
		} else if(score >= 70) {
			System.out.print("C학점");
		} else if(score >= 60) {
			System.out.print("D학점");
		} else {
			System.out.println("E학점");
		}
	}

}
