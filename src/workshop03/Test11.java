package workshop03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		while(b<a) {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if(a>b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		}
		System.out.printf("b - a는 %d입니다.",b-a);
		
	}

}
