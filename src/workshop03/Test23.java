package workshop03;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("임의의수 입력: ");
		int num=sc.nextInt();
		int sum=0;
		int i=num;
		
		while (1<=i) {
			sum=sum+(i);
			i--;
		}
		
		System.out.println("입력하신 숫자의 총합: "+sum);
	}

}
