 
public class FindMinDis {

	public static int findminDis(int arr[], int n, int x, int y) {
		int i=0;
		int min=Integer.MAX_VALUE;
		int prev=-1;
//		for (i=0; i<n; i++) {
//			if (arr[i]==x || arr[i]==y) {
//				prev=i;
//				break;
//			}
//		}
		for(i=0; i<n; i++) {
			if (arr[i]==x || arr[i]==y) {
			if(prev!=-1 && arr[i]!=arr[prev] ) 
					min=Math.min(min, i-prev);
					prev=i;
			
				
			}
		}
					if(min==Integer.MAX_VALUE)
                     return -1;
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,5,4,2,3,0,0,5,6,4,8,3};
      int n=arr.length;
      System.out.println(findminDis(arr,n,3,6));
	}

}
