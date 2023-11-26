package java_ex100;
import java.util.Scanner;
import java.util.Random;

public class ex100_100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100)+1;
		
		int guess;

        do {
            System.out.println("번호를 입력하세요.");
            guess = scan.nextInt();

            if (guess < answer) {
                System.out.println("번호가 정답보다 작습니다.");
            } else if (guess > answer) {
                System.out.println("번호가 정답보다 큽니다.");
            } else {
                System.out.println("정답입니다.");
            }
        } while (guess != answer);
	}

}
