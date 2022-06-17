import java.util.Arrays;

public class WaveArray {

	public static void waveArray(int arr[] , int n) {
		for(int i=0; i<n; i+=2) {
			if ( i>0 && arr[i]< arr[i-1] )
			{
				int temp=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if (i<n-1 && arr[i] < arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,1,3,5,4};
		int n=arr.length;
		 
		
		Arrays.sort(arr);
		waveArray(arr, n);
		for (int i=0; i<n; i++) {
		System.out.println(arr[i] + " ");	
		}
	}
}
