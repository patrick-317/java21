package workshop02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = null;
		int age = 0;
		
		System.out.println("1.이름을 입력하세요.");
		name = sc.next();
		
		System.out.println("2.나이를 입력하세요.");
		age = sc.nextInt();
		
		System.out.println("이름은 "+ name + "\n" + "나이는 " + 
		age + " 입니다");
		
		sc.close();
	}

}
