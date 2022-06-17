//import java.util.*;
public class ProductSubarray {
	public static int productSubarray(int[] arr, int n) {
		int ans=arr[0];
		
		for(int i=0; i<n; i++) {
			int prod=arr[i];
			for(int j=i+1;j<n; j++){
				ans=Math.max(ans, prod);
				prod+=arr[j];
			}
			ans=Math.max(ans, prod);
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		
		int k=productSubarray(arr, n);
		System.out.println(k);
	}

}
