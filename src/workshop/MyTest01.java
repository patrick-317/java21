package workshop;

import java.util.Scanner;

public class MyTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "홍길동";
		int age = 20;
		String city = "서울";
		
		System.out.println("1. println 사용");
		System.out.println("이름은 "+ name + "\n" + "나이는 " + 
		age + " 이고 주소는 " + city);
		
		System.out.println("\n2. print 사용");
		System.out.println("이름은 "+ name + "\n" + "나이는 " + 
				age + " 이고 주소는 " + city);
				
		System.out.println("\n3. printf 사용");
		System.out.printf("이름은 %s \n나이는 %d 이고 주소는 %s", name, age, city);
	}

}
