package SearchingAndSortingDSA450plus;

import java.util.HashSet;
import java.util.Set;

public class FindAPairWithAGivenDifference {
	static int difference(int arr[] , int n  , int x) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<n ;i++) {
		    set.add(arr[i]);
		
			if(set.contains(arr[i]-x))
				return 1;	
		}
		return -1;
	}
public static void main(String[] args) {
	int[] arr = {90,70,20,80,50};
	int n = arr.length;
	int x = 40;
	System.out.println(difference(arr,n,x));
}
}
