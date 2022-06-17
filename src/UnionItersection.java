import java.util.*;

public class UnionItersection {
	
	 static ArrayList<Integer> unionO(int arr1[], int arr2[]) {
		 Set <Integer> set=new HashSet<>();
		 
		 for (int i : arr1) {
			 set.add(i);
		 }
		 for (int i : arr2) {
			 set.add(i);
		 }
		 ArrayList<Integer> list
         = new ArrayList<>();
     for (int i : set)
         list.add(i);

     return list;
	 }
    static int union(int arr1[], int arr2[], int m, int n) {
    	int i=0 ,j=0;
    	while (i<m && j<n) {
    		if (arr1[i]<arr2[j]) {
    			System.out.print(arr1[i++]+ " ");
    		
    	}
    		else if (arr1[i]>arr2[j]) {
    			System.out.print(arr2[j++]+ " ");
    		}
    		else {
    			System.out.print(arr2[j++] + " ");
    			i++;
    		}
    }
    	while (i<m) {
    		System.out.print(arr1[i++]+ " ");
    	}
    	while (j<n) {
    		System.out.print(arr2[j++]+ " ");
    	}
    	return 0;
    }
    static int intersectionO(int arr1[], int arr2[]) {
    	Set <Integer> set =new HashSet<>();
    	int count=0;
    	for(int i: arr1) {
    		set.add(i);
    	}
    	for (int i: arr2) {
    		if (set.contains(i)) {
    			count++;
    			set.remove(i);
    		}
    	}
    	Set<Integer> list
        = new HashSet<>();
    for (int i : count)
        list.add(i);

    return count;
    }
    static int intersection(int arr1[], int arr2[], int m, int n) {
    	int i=0,j=0;
    	while (i<m && j<n) {
    		if (arr1[i] < arr2[j]) {
    			i++;
    		}
    		else if (arr1[i]>arr2[j]) {
    			j++;
    		}
    		else {
    			System.out.print(arr2[j++] +" ");
    			i++;
    		}
    	}
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
       // union(arr1, arr2, m, n);
        System.out.print(unionO(arr1, arr2));
        System.out.println();
       // intersection(arr1,arr2,m,n);
        System.out.print(intersectionO(arr1,arr2));
	}

}
