package java_ex100;
import java.util.Scanner;

public class ex100_95 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		char[] charArray = str.toCharArray();

        int[] alp = new int[26];

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if ('a' <= currentChar && currentChar <= 'z') {
                int index = currentChar - 'a';
                alp[index]++;
            }
        }

        for (int i = 0; i < alp.length; i++) {
            System.out.printf("%c: %d \n", (char) ('a' + i), alp[i]);
        }
	}

}
