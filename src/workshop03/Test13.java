package workshop03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("2자리의 정수를 입력하세요.");
		while(a<10||a/100!=0) {
			System.out.print("입력 : ");
			a = sc.nextInt();
		}
		System.out.printf("입력 값은 %d",a);
		sc.close();
	}
	
}
