
public class CLL {

	public static int void (int arr[], int n) {
		
		int max=0;
		for (int i=0; i<n; i++){
			if (arr[i]<0)
				arr[i]=0;
			max=Math.max(max, arr[i]);
			
		}
		max++;
		for (int i=0; i<n; i++) {
			int val =arr[i]%max;
			if (val>0 && val<=n) {
				arr[val-1]=arr[val-1]+max;
			}
		}
		for (int i=0; i<n; i++)
		{
			if (arr[i]<max) return i+1;
			//System.out.println(arr[i] + " ");
//			}
//		return n+1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
