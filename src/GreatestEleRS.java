
public class GreatestEleRS {
	public static void greatERS(int arr[], int n) {
		int rightmos = arr[n-1];
		arr[n-1]=-1;
		
		for (int i=n-2; i>=0; i--) {
			int temp=arr[i];
			
			arr[i]=rightmos;
			
			if (rightmos<temp)
				rightmos=temp;
				
		}
	}
	public static void main(String[] args) {
		int arr[]= {16, 17, 4, 3, 5, 2};
		int n=arr.length;
		
		greatERS(arr, n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
