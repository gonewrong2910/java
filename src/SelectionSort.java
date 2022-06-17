
public class SelectionSort {
	 public static void main(String[] args) {
		 int arr[]= {2,7,4,7,8,9};
		 int n =arr.length;

		 for (int i=0; i<n; i++) {
			 int small=i;
			 for (int j=i+1; j<n; j++) {
				 if (arr[j] < arr[small] ) {
					 small=j;
				 }
				 int tmp=arr[small];
				 arr[small]=arr[i];

				 arr[i]=tmp;
		 }
			 
			 }
		 for (int i=0; i<n; i++) {
			 System.out.print(arr[i] + " ");
			 
}
}
}
