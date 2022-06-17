
public class segregate0s1s {
	
	public static void segregate01(int arr[], int n) {
		int left=0;
		int right =n-1;
		
		while (left<right ) {
			while(arr[left] ==0  && left<right) {
				left++;
			}
			while (arr[right]==1 && left<right) {
				right--;
			}
			if (left<right)
				arr[left]=0;
			arr[right]=1;
			left++;
			right--;
		}
	}
	public static void main(String[] args ) {
		int arr[]= {0,0,1,0,1,0,1,0,1,0};
		int n=arr.length;
		segregate01(arr,n);
		for (int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
