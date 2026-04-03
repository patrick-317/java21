package workshop03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값: ");
		a = sc.nextInt();
		System.out.print("b 값: ");
		b = sc.nextInt();
		System.out.print("c 값: ");
		c = sc.nextInt();
		
		if(a>b && a>c) {
			max = a;
		} else if(b>a && b>c) {
			max = b;
		} else if(c>a && c>b) {
			max = c;
		}
		System.out.println("최대값: "+ max);
	}

}
