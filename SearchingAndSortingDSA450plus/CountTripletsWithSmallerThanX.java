package SearchingAndSortingDSA450plus;

import java.util.Arrays;

public class CountTripletsWithSmallerThanX {
	static int  countTriplets(int[] arr,int n ,int x) {
		Arrays.sort(arr);
		int ans=0;
		for(int i=0;i<n-2;i++) {
			int j = i+1,k=n-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]>=x) k--;
				
				else {
					ans += (k-j);
					j++;
				}
			}
		}
		return ans;
	}
public static void main(String[] args) {
	int[] arr = {5,1,3,4,7};
	int x = 12;
	int n = arr.length;
	System.out.println(countTriplets(arr,n,x));
 }
}
