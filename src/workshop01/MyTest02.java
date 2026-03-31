package workshop01;

import java.math.BigInteger;
import java.util.Scanner;

public class MyTest02 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		BigInteger IDNum = new BigInteger("0103173000000");
		
		System.out.println("나의 주민번호 : " + IDNum);

		sc.close();
	}

}
