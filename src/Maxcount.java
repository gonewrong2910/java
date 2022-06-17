
public class Maxcount {

	public static void maxCount(int arr[], int n) {
		int maxcount =0;
		int count;
		int index= -1;
		for(int i=0; i<n; i++) {
			count=0;
			for (int j=0; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if (count>maxcount) {
					maxcount=count;
					index=i;
				}
			}
		}
		
		if (maxcount%2!=0)
			System.out.println(arr[index] + " ");
	}
	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 1, 3, 5,3,3, 1};
		int n=arr.length;
		maxCount(arr, n);
		
		// TODO Auto-generated method stub

	}

}
