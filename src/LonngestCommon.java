
public class LonngestCommon {
	static int arr1[] = new int[]{0, 1, 0, 1, 1, 1, 1};
    static int arr2[] = new int[]{1, 1, 1, 1, 1, 0, 1};
	
    static int longestCommon( int n) {
    	int maxlen=0;
    	
    	for(int i=0; i<n; i++){
    		int sum1=0;
    		int sum2=0;
    		for (int j=i; j<n; j++) {
    			sum1+=arr1[j];
    			sum2+=arr2[j];
    			
    			if (sum1==sum2) {
    				int len=j-i+1;
    				if(len>maxlen)
    					maxlen=len;
    			}
    			
    			
    		}
    	}
    	return maxlen;
    }
	public static void main(String[] args) {
		
		 
		 System.out.println(longestCommon(arr1.length));

	}

}
