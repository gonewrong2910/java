
public class code {
    
	static void firstMissingEle(int[] arr){
        int max = arr.length + 1, n = arr.length;
        for(int i = 0; i < n; i++){
            int val = arr[i] % max;
            arr[val - 1] = arr[val - 1] + max;
        }
        int maxfreq = 0, num = 0;
        for(int i = 0; i < n; i++){
           if(arr[i]/max > maxfreq){
                maxfreq=arr[i]/max;
                num=i+1;
            }  
        }
        System.out.print("maximum frequency = "+num);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
