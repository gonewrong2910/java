import java.util.Arrays;

public class RemoveElement {
	public static int removeDuplicate(int[] a, int n, int k) {
		int i=0;
		for(int j=0; j<n; j++) {
			if (a[j]!=k) {
			
				a[i]=a[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int a[]= {2,3,5,6,4,5,5,7,8,9};
		int n=a.length;
		
		Arrays.sort(a);
		int ans=removeDuplicate(a, n, 5);
		System.out.println(ans);
		//int k=n-ans;
		int m=n-ans;
		
		for(int i=0; i<n-m; i++) {
			System.out.print(a[i]+ " ");
		}

}
}
