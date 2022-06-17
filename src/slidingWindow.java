//import java.util.*;							
public class slidingWindow {
	public static void  main(String[] args) {
		int arr[]= {3,5,6,7,9,10,21,22};
		int n=arr.length;
		int k=3;
		
		//Arrays.sort(arr);
		
		//System.out.print(arr);
		int j, max;
		for(int i=0; i<=n-k; i++) {
			max=arr[i];
			for( j=1; j<k; j++) {
				if (arr[j+i]>max) {
					max=arr[j+i];
				}
				
			}
			System.out.print(max + " ");
		}
		
		
	}

}
