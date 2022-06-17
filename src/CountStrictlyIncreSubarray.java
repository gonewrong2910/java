
public class CountStrictlyIncreSubarray {

	static int countSubarrayOp(int arr[], int n) {
		
		int count=0;
		int len=1;
		for (int i=0; i<n-1 ; i++) {
			if (arr[i]<arr[i+1])
				len++;
			
			else
			{
				count+=len*(len-1)/2;
				len=1;
			}
		}
		if (len>1) {
			count+=len*(len-1)/2;
		}
		return count;
	}
	
	static int countSubarray(int arr[], int n) {
		
		int count =0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (arr[j]> arr[j-1])
					count++;
				else 
					break;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,2,4};
      int n=arr.length;
       int a=countSubarray(arr, n);
       int b=countSubarrayOp(arr, n);
       System.out.println(a);
       System.out.println(b);
	}

}
