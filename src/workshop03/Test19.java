package workshop03;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int col = 0;
		
		System.out.println("피라미드 모양 삼각형");
		System.out.println("몇 단 삼각형입니까? : ");
		col = sc.nextInt();

		for (int i = 1; i <= col; i++) {
			for(int k = col; k>= i; k--) {
				System.out.print(" ");
			}
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

	}

}
