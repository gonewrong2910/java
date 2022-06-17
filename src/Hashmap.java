import java.util.*;
import java.util.Map.Entry;
public class Hashmap {
	public static void coutFreq(int arr[], int n) {
		Map<Integer, Integer> mp=new HashMap<>();
		
		for (int i=0; i<n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		for (Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		 int arr[]= {2,7,4,7,8,9,5,4,4,3,3,3,3,7,7,9,9};
		 int n =arr.length;
		 coutFreq(arr, n);

}
}