package workshop03;

public class Test08 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=100) {
			System.out.print(i+ " ");
			if(i%3==0) {
				System.out.print("foo ");
			}
			if(i%5==0) {
				System.out.print("bar ");
			}
			if(i%7==0) {
				System.out.print("baz ");
			}
			i++;
			System.out.println();
		}

	}

}
