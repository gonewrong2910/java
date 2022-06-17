import java.util.*;
public class HashMaps {

	public static void hashMap(int arr[], int sum) {
		HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
		int cursum=0;
		int start=0;
		int end=-1;
		int i;
		for ( i=0; i<arr.length; i++) {
			cursum+=arr[i];
			
		
		if (cursum-sum==0) {
			start=0;
			
			end=i;
			break;

		}
		if (map.containsKey(cursum-sum)) {
			start=map.get(cursum-sum)+1;
			end=i; 
			break;
		}
		map.put(cursum, i);
		}
		
		if (end==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println(start+ " " + end);
		}
	}
	public static void main(String[] args) {
       int arr[] = {10, 15, -5, 15, -10,5};
       hashMap(arr, 5);
	}

}
