import java.util.*;
public class FindLostEle {
	
	public static int FindMissingInB(int A[], int B[], int N)
    {
        //condition
        //only one element in A and B is empty
        if (N == 1)
            {
                return A[0];
            }
        //condition
        //First element is missing
        // special case, for first element missing
        if (A[0] != B[0])
            {
                return A[0];
            }
        //condition
        //element is in between  
        // Initialize low and high 
        int low = 0,high = N - 1;
        while (low < high)
        {
            int mid = (low + high) / 2;
            //mid elements are equal then search in right subarray
            if (A[mid] == B[mid])
                {
                    low = mid;
                }
            else //mid elements are not eqaul 
                {
                    high = mid;
                }
            // end when low = high -1
            if (low == high - 1)
                {
                    break;
                }
        }
        //Missing element
        return A[high];
    }
    //Checking conditions Size A > Size B or 
    public static void FindMissing(int A[], int B[], int M, int N)
    {
        if(N == M-1)
        {
            System.out.println("Missing Element: " + FindMissingInB(A, B, M));
        }
        else if(M == N-1)
        {
            System.out.println("Missing Element: " + FindMissingInB(B, A, N));
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
    public static void main(String[] args)  
    { 
    	int A[] = {1, 6, 4, 8, 9};
        int B[] = {6, 4, 8, 9,1,3};
        int M=A.length;
        int N=B.length;
        FindMissing(A,B,M,N); 
    }

}
