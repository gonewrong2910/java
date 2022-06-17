
public class Random {
	
	public static void main(String[] args) {
		int a[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=a.length;
		
		int ans=maximunmSum(a, n);
		System.out.println(ans);
		

}

	public static int maximunmSum(int[] a, int n) {
		int cur=0;
		int maxsum=0;
		for(int i=0; i<n; i++) {
			cur=cur+a[i];
			if (maxsum<cur) {
				maxsum=cur;
			}
			if (cur<0) {
				
				cur=0;
			}
			
			//return maxsum;
			
		}
		return maxsum;
	}
}