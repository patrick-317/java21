package workshop02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("1.정수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("2.정수를 입력하세요.");
		num2 = sc.nextInt();
		result = num1+num2;
		
		System.out.printf("정수 %d 과 정수 %d 의 합계 : %d", num1, num2, result);
	}
}
