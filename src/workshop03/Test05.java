package workshop03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int sum = 0;
		int count = 0;
		float avg = 0;
		
		System.out.println("정수를 입력하시오");
		a = sc.nextInt();
		
		for(int i=1; i<a; i++) {
			if(i%2==0) {
				sum = sum+i;
				count++;
			}
		}
		avg = sum/count;
		
		System.out.println("총합: "+ sum);
		System.out.println("평균 : "+ avg);
	}

}
