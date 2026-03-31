package workshop02;

public class Test06 {

	public static void main(String[] args) {
		
		int i = 5;
		String result = (i%2==0) ? "짝수" : "홀수";
		System.out.printf("선언변수 %d 일때 결과:\n숫자 %d는 %s입니다", i,i,result);
		
	}
}
