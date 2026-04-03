package workshop03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		ArrayList<Integer> mult = new ArrayList<Integer>();
		int sum=0;
		int j=0;
		
		System.out.println("한 자리 정수값을 입력하시오");
		input = sc.nextInt();
		
		for(int i=0; i<=100; i++) {
			if(i%input==0) {
				sum = sum+i;
				mult.add(i);
			}
		}
		while(j<mult.size()) {
			mult.get(j);
			System.out.printf("%d+",mult.get(j));
			j++;
		}
		System.out.println(" = " + sum);
	}

}
