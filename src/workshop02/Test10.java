package workshop02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String address = null;
		String[] add = null;
		
		System.out.println("주소를 입력하시오.");
		address = sc.nextLine();
		add = address.split(" ");
		
		System.out.println(address);
		System.out.println("도명: "+add[0]);
		System.out.println("시명: "+add[1]);
		System.out.println("구명: "+add[2]);
	}

}
