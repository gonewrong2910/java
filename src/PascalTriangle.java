
public class PascalTriangle {
	public int facotrial(int i) {
		if (i==0) 
			return 1;
			
			return i*facotrial(i-1);
		
	
	}
	public static void main(String[] args) {
		PascalTriangle g = new PascalTriangle();
		int n=5 , i, j;;
		
		for ( i=0; i<=n; i++) {
			for (j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for (j=0; j<=i; j++) {
				System.out.print(" " +  g.facotrial(i)/(g.facotrial(i-j)*g.facotrial(j)));
			}
			System.out.println();
		}
		
	}

}
