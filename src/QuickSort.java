
public class QuickSort {
	public static void quickSort(int arr[], int start, int end) {
		if(start<end) {
			
			int pos=pivotElement(arr, start, end );
			
			quickSort(arr, start, pos-1);
			quickSort(arr, pos+1, end);
		}
	}
	private static int pivotElement(int[] arr, int start, int end) {
		
		int pivot=arr[end];
		int i=start-1;
		
		for (int j=start; j<end; j++) {
			if(arr[j]< pivot) {
				i++;
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				
			}
		}
		i++;
		int tmp=arr[i];
		arr[i]=pivot;
		arr[end]=tmp;
		
		return i;
	}
	public static void main(String[] args) {
		 int arr[]= {2,7,4,7,8,9};
		 int n =arr.length;
		 
		 quickSort(arr, 0, n-1);
		 
		 for (int i=0; i<n; i++) {
			 System.out.print(arr[i]+ " ");
		 }

}
}