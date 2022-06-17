
public class MatrixZero {
	static void setZero(int arr[][]) {
		int col0=1, rows=arr.length, cols=arr[0].length;
		
		for (int i=0; i<rows; i++) {
			if (arr[i][0]==0) col0=0;
			for (int j=1; j<cols; j++) {
				if (arr[i][j]==0)
					arr[i][0]= arr[0][j]=0;
			}
		}
		for (int i=rows-1; i>=0; i--) {
			for (int j=cols-1; j>=0; j--) 
				if (arr[i][0]==0 || arr[0][j]==0) 
					arr[i][j]=0;
				
				if (col0==0)  arr[i][0]=0;
			
		}
	}
	public static void main(String[] args) {
		int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		setZero(arr);
		
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[0].length; j++){
			System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
