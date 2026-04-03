package workshop03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int worktime = 0;
		int salary = 0;
		float bonus = 0;
		
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		worktime = sc.nextInt();
		System.out.print("월급입력 : ");
		salary = sc.nextInt();
		
		if(worktime>25) {
			bonus=1.0f;
		} else if(worktime>20) {
			bonus=0.8f;
		} else if(worktime>18) {
			bonus=0.5f;
		} else {
			bonus=0.0f;
		}
		
		System.out.println("====================");
		System.out.println("보너스 : " + (int)(salary*bonus));
		System.out.println("지급될 급여 : " + (int)(salary+(salary*bonus)));
	}

}
