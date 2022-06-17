
public class floorceiling {

	public static int floorCeiling(int arr[], int f, int c, int x) {
		int i;
		if (x<=arr[f])
			return f;
		
		for ( i=0; i<c; i++) {
			if (arr[i]==x)
				return i;
			
			if (arr[i]<x && arr[i+1]>=x)
				return i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 8, 10, 10, 12, 19};
	       int n = arr.length;
	       int x = 9;
	       int i = floorCeiling(arr, 0, n-1, x);
	       if(i == -1)
	           System.out.println("Ceiling of "+x+" doesn't exist in array");
	         else
	           System.out.println("ceiling of "+x+" is "+arr[i]);
	}

}
