package workshop03;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = -1;
		int digit = 0;
		
		System.out.println("양의 정수값의 자릿수 구하기");
		while(a<0) {
			System.out.print("정수값 : ");
			a = sc.nextInt();
		}
		while(a>0) {
			a = a/10;
			digit++;
		}
		System.out.printf("그 수는 %d자리입니다.",digit);
		sc.close();
	}

}
