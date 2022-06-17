
public class BubbleSort {
	 public static void main(String[] args) {
		 int arr[]= {2,7,4,7,8,9};
		 int n =arr.length;
		 
		 for(int i=0; i<n-1; i++) {
			 for(int j=0; j<n-i-1; j++ ) {
				 if (arr[j] > arr[j+1] ) {
					 int tmp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=tmp;
				 }
			 }
		 }
		 for (int i=0; i<n; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 
	 }

}
