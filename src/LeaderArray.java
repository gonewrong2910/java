
public class LeaderArray {
	 
	public static void leaderOfArray(int arr[], int n) {
		int right = arr[n-1];
		
		for (int i=n-2; i>=0; i--) {
			if (right<arr[i]) {
				right =arr[i];
				System.out.println(right+ " ");
			}
		}
	}

	public static void leaderArray(int arr[], int n) {
		
		for (int i=0; i<n; i++) {
			int j;
			for (j=i+1; j<n; j++) {
				if (arr[i] <=arr[j]) 
					break;
				}
				if(j==n) 
					System.out.println(arr[i] +" ");
				
					
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {16,17,4,3,5,2};
          int n=arr.length;
          leaderArray(arr, n);
          leaderOfArray(arr, n);
	}

}
