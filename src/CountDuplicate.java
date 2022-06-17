import java.util.*;
public class CountDuplicate {

	public static void countDuplicate(int arr[], int n) {
		boolean visit[]=new boolean[n];
		Arrays.fill(visit, false);
		
		for (int i=0; i<n; i++) {
			if (visit[i]==true)
				continue;
			int count=1;
			for (int j=i+1; j<n; j++) {
				if (arr[i]==arr[j]) {
					visit[j]=true;
				count++;
				}
			}
		
		System.out.println(arr[i] + "-> " + count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,3,4,5,4,7,56,8,9,6,80,5};
		int n=arr.length;
		Arrays.sort(arr);
		countDuplicate(arr,n);
		
	}

}
