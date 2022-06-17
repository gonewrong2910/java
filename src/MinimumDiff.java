import java.util.Arrays;

public class MinimumDiff {
	
	public static int minimumDiffO(int arr[], int n) {
		int diff=Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		for (int i=0;i<n-1; i++) {
			if (arr[i+1]-arr[i] <diff)
				diff=arr[i+1]-arr[i];
		}
		return diff;
	}
	public static int minimumDiff(int arr[], int n) {
		int diff =Integer.MAX_VALUE;
		
		for (int i=0; i<n; i++) {
			for (int j=i+1;j<n; j++) {
				if (Math.abs(arr[i]-arr[j]) < diff) {
					diff=Math.abs(arr[i]-arr[j]);
				}
			}
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,654,4,56,6,8};
		int n=arr.length;
		System.out.println(minimumDiff(arr,n));
		System.out.println(minimumDiffO(arr,n));
	}

}
