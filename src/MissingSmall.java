import java.util.Arrays;

public class MissingSmall {

	static int msssing(int arr[], int n) {
		
		Arrays.sort(arr);
		
		int ans=1;
		for (int i=0; i<n; i++)
		{
			if (arr[i]==ans) {
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,1,0,-1,-2 };
	    int n = arr.length;
	   int a= msssing(arr, n);
	   System.out.println(a);
	}

}
