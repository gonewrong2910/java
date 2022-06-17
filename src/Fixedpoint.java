
public class Fixedpoint {
	public static int fixedPoint(int arr[], int n) {
		
		for(int i=0; i<n; i++) {
			if (arr[i]==i) 
				return i; //  continue;
		
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {-10, -5,3,3, 7};
		int n=arr.length;
		int a=fixedPoint(arr, n);
		System.out.println(a );
	}
}
