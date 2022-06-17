
public class Bitonicsubarray {
	
	public static int bitonic(int arr[], int n) {
		int inc[]=new int [n];
		int dec[]=new int [n];
		inc[0]=1;
		dec[n-1]=1;
		
		int max;
		for (int i=1; i<n; i++) {
			inc[i]=(arr[i]>=arr[i-1])? inc[i-1]+1:1;
		}
		for (int i=n-2; i>=0; i--) {
			dec[i]=(arr[i]>=arr[i+1])? dec[i+1]+1:1;
		}
		max=inc[0]+dec[0]-1;
		for (int i=0;i<n; i++) {
			if (inc[i]+dec[i]-1>max) {
				max=inc[i]+dec[i]-1;
			}
		}
		return max;
	}
	public static void main (String[] args)
    {
        int arr[] = {12, 4, 78, 90, 45, 23};
        int n = arr.length;
        System.out.println("Length of max length Bitnoic Subarray is "
                            + bitonic(arr, n));

}
}