package SearchingAndSortingDSA450plus;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
	static int zeroSum(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int count=0;
		int sum=0;

		for(int i=0;i<arr.length;i++) {
		    set.add(sum);
			sum += arr[i];
			if(set.contains(sum)){
				count++;
				continue;
				//break;
			}
		//	System.out.println(count);
		}
		return count;
	}
public static void main(String[] args) {
	int[] arr = {0,0,5,5,0,0};
	System.out.println(zeroSum(arr));
}
}
