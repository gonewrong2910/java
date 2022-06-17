import java.util.*;
public class New {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the numbers");
        int[] array = new int[n];
        int[] result = new int[2];
        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        for (int i : array)
        {
            array[i] = sc.nextInt();
            if (hmap.containsKey(9 - array[i]))
            {
                int z = hmap.get(9 - array[i]);
                result[0] = z;
                result[1] = i;
                System.out.println(result[0]+" "+result[1]);
            }
            hmap.put(array[i],i);
        }
        for(int j: array)
        System.out.print("array->"+array[j]);
        System.out.println();
        System.out.print(hmap);

	}

}
