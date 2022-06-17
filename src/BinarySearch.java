
public class BinarySearch {
	public static int  binarySearch(int arr[], int l, int r, int k) {
		
		if (r>=l) {
			int mid =l+(r-l)/2;
			
		
		if (arr[mid]==k) 
			return mid;
			
		if (arr[mid]> k)
			return binarySearch(arr, l , mid-1, k);
		
		if (arr[mid]<k)
			return binarySearch (arr, mid+1, r, k);
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,7,8,9};
		int n=arr.length;
		
		int result=binarySearch(arr, 0, n-1, 12);
		
		if (result==-1) {
			System.out.println("element not present");
			
		}
		else {
			System.out.println("element present");
		}
      
}
}
