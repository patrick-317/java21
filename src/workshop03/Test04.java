package workshop03;

public class Test04 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1; i<6; i++) {
			for(int j=6; j>0; j--) {
				if(i+j==6) {
					System.out.printf("%d+%d=%d",i,j,i+j);
					System.out.println();
					count++;
				}
			}
		}
	}

}
