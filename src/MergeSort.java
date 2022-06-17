
public class MergeSort {
	public static void divideSort(int arr[], int start, int end) {
		if(start<end) {
			int mid=start+(end-start)/2;
			
			divideSort(arr, start, mid);
			divideSort(arr, mid+1, end);
			conquerorSort(arr, start, mid, end);
			
		}
	}
	public static void conquerorSort(int[] arr, int start, int mid, int end) {
		
		int new_arr[]=new int [end-start+1];
		int i=start, j=mid+1, k=0;
		while (i<=mid && j<=end) {
			if(arr[i]< arr[j]) {
				new_arr[k++]=arr[i++];
				
			}
			else {
				new_arr[k++]=arr[j++];
	
			}
		}
		while (i<=mid) {
			new_arr[k++]=arr[i++];
		}
		while (j<=end) {
			new_arr[k++]=arr[j++];
		}
		k=0;
		for (i=start; i<end; i++) {
			arr[i]=new_arr[k];
			k++;
		}
		}
	public static void main(String[] args) {
		 int arr[]= {2,7,4,7,8,9};
		 int n =arr.length;
		 
		 divideSort(arr, 0, n-1);
		 
		 for (int i=0; i<n; i++) {
			 System.out.print(arr[i]+ " ");
		 }
}
}