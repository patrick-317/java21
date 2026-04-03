package workshop03;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input=0;
		int sum=0;
		
		System.out.println("1부터 n까지의 총합 구하기");
		
		while(input<=0) {
			System.out.print("n 값: ");
			input = sc.nextInt();
		}
		for(int i=0; i<=input; i++) {
			sum = sum+i;
		}
		System.out.printf("1부터 %d 까지의 총합: %d", input, sum);
	}

}
