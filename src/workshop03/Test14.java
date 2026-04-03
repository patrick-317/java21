package workshop03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		a = sc.nextInt();
		
		System.out.println("----- 곱셈표 -----");
		for(int i=1; i<a; i++) {
			for(int j=1; j<a; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
		sc.close();
	}
		
}
