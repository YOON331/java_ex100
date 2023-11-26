package java_ex100;
import java.util.Scanner;

public class ex100_59 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lotto = scan.nextLine();
		String input = scan.nextLine();
		int sameNum = 0;
		
		String lottoNum[] = lotto.split(" ");
		String inputNum[] = input.split(" ");
		
		for(int i = 0; i < lottoNum.length -1; i++) {
			for(int j = 0; j < inputNum.length; j++) {
				if(lottoNum[i].equals(inputNum[j])) {
					sameNum++;
					break;
				}
			}
		}
		
		if(sameNum == 5) {
			for(int j = 0; j < inputNum.length; j++) {
				if(lottoNum[6].equals(inputNum[j])) {
					sameNum+=2;
				}
			}
		}
		
		switch (sameNum) {
			case 6 : {
				System.out.println("1등");
				break;
			}
			case 7 : {
				System.out.println("2등");
				break;
			}
			case 5 : {
				System.out.println("3등");
				break;
			}
			case 4 : {
				System.out.println("4등");
				break;
			}
			case 3 : {
				System.out.println("5등");
				break;
			}
			default: {
				System.out.println("꽝");
				break;
			}
		}
		
		System.out.println(lotto);



	}

}
