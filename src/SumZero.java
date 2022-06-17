
public class SumZero {

	public static void sumZero(int arr[], int n) {
		
		int sum, minl=0, minr=1;
		int min_sum=arr[0]+ arr[1];
		
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				sum=arr[i]+arr[j];
				if (Math.abs(min_sum)> Math.abs(sum)) {
					min_sum=sum;
					minl=i;
					minr=j;
				}
			}
		}
		System.out.println(min_sum + " " +arr[minl]+ " "+ arr[minr]);
	}
	public static void main(String[] args) {
		int arr[]= {1, 60, -10, 70, -80, 85};
		int n=arr.length;
		sumZero(arr,n);
		
	}
}
