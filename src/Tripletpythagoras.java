
public class Tripletpythagoras {

	public static boolean tripletPytha(int arr[], int n) {
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				for (int k=j+1; k<n; k++) {
					if (arr[i]*arr[i]+ arr[j]* arr[j]==arr[k]*arr[k]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,4,6,12,5};
		int n=arr.length;
		boolean x=tripletPytha(arr, n);
		if (x!=true) {
			System.out.print("false");
		}
		else {
			System.out.print("true");
		}

	}

}
