package workshop03;

public class Test22 {

	public static void main(String[] args) {
		
		char c = 'A';
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print((char)(c+j));
			}
			System.out.println();
		}
		

	}

}
