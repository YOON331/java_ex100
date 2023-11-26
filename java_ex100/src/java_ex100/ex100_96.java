package java_ex100;
import java.util.Scanner;

public class ex100_96 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String name[] = new String[num];
		int score[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			name[i] = scan.next();
			score[i] = scan.nextInt();
		}
		for (int i = 0; i < name.length - 1; i++) {
            for (int j = 0; j < name.length - i - 1; j++) {
                if (score[j] > score[j + 1]) {
                    int tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                }
            }
        }
		System.out.printf("%s\n", name[name.length-3]);
		
       

	}

}
