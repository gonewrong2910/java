
public class FIndDuplicate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		int n=arr.length;
		
		for (int i=0; i<n; i++) {
			 arr[arr[i]% n] = arr[arr[i]%n] +n;
		}
		for (int i=0; i<n; i++) {
			if (arr[i]>= n*2) {
				System.out.println(i);
			}
			
		}
	}

}
