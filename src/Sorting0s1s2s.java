
public class Sorting0s1s2s {

	public static void sorting012(int arr[], int n) {
		int i,cout=0, cout1=0, cout2=0;
		
		for(i=0; i<n; i++) {
			switch (arr[i]) {
			case 0:
			     cout++;
			     break;
			
			case 1:
				cout1++;
				break;
			
			case 2: 
				cout2++;
				break;
			}
		}
		 i=0;
		while(cout> 0) {
			arr[i++]=0;
			cout--;
		}
		while(cout1>0) {
			arr[i++]=1;
			cout1--;
		}
		while(cout2>0) {
			arr[i++]=2;
			cout2--;
			
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sorting012(arr, n);
        
        for(int i=0; i<n; i++) {
        System.out.print(arr[i]+" ");
	}

}
}