import java.util.*;
public class f {
	static int nonRepeating(int arr[], int n) {
		unordered_map <int> umap;
		
		for (int i=0; i<n; i++) {
			umap[ar[i]]++;
			
			
		}
		for(int i=0;i<n;i++) {
			int key=arr[i];
			auto temp=umap.find(key);
			if(temp->second==1) 
				return key;
			
		}
		return 0;
	}
    public static void main(String args) {
    	int arr[]= {2,3,4,2,3,6,6};
    	int n=arr.length;
    	
    	int ans=nonRepeating(arr, n);
    	
    	System.out.println(ans);
    }
}
