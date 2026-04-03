package workshop03;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int col = 0;
		
		System.out.println("오른쪽 가 직각인 이등변 삼각형을 출력합니다.");
		System.out.println("몇 단 삼각형입니까? : ");
		col = sc.nextInt();

		for (int i = col; i>= 1; i--) {
			for(int k = col; k>= i; k--) {
				System.out.print(" ");
			}
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
	}
}
