import java.util.*;
public class SlidingWindows {

	public static void slidingWindow(int arr[], int k) {
		HashMap <Integer, Integer> map =new HashMap<>();
		
		for (int i=0;i<k;i++) {
			map.put(arr[i] , map.get.default(arr[i], 0)+1);
		}
		for (int i=k; i<arr.length; i++) {
			if (map.get(arr[i-k]==1) ); 
				map.remove(arr[i-k]);
			
			else 
				map.put(arr[i-k], arr[i-k]=-1);
			
			map.put(arr[i] , map.get.default(arr[i], 0)+1);
			
			System.out.println(map.size());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
