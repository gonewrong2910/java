import java.util.*;
public class RemoveDuplicate {
	public static int removeDuplicate(int[] a, int n) {
		int i=0;
		for(int j=1; j<n; j++) {
			if (a[j]!=a[i]) {
				i++;
				a[i]=a[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		int a[]= {2,3,5,6,4,5,5,7,8,9};
		int n=a.length;
		
		Arrays.sort(a);
		int ans=removeDuplicate(a, n);
		System.out.println(ans);
		int k=n-ans;
		
		for(int i=0; i<n-k; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
