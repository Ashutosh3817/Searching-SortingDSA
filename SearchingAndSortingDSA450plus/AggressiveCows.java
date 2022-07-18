package SearchingAndSortingDSA450plus;

import java.util.Arrays;
                                  
class AggressiveCows {
	static int aggressive(int[] arr,int n,int cows ) {
		int low=1;
		int high = arr[n-1]-arr[0];
		int res=0;
		while(low<=high) {
			int mid = (low+high)/2;
			if(canPlaceCows(arr, n , cows, mid)) {
				 res = mid;
				low = mid+1;
			}
			else
				high=mid-1;             
		}
		return res;
	}
	static boolean canPlaceCows(int[] arr,int n ,int cows,int dist) {
		int cord=arr[0];//co-ordinate
		int count=1;
		for(int i=1;i<n;i++) {
			if(arr[i] - cord>=dist) {
				count++;
				cord=arr[i];
			}
			//if(count==cows) return true;
		}
		if(count==cows) return true;
		else return false;
		 
	}
public static void main(String[] args) {
	int[] arr = {1,2,4,8,9};
	Arrays.sort(arr);
	int n =arr.length;
	int cows=3;
	System.out.println(aggressive(arr,n,cows));
}
}
