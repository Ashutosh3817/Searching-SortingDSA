package SearchingAndSortingDSA450plus;

import java.util.Arrays;

public class BishuAndSoldiers {
	static int bishu(int[] arr,int s) {
		int n = arr.length;
		Arrays.sort(arr);
		if(arr[n-1]<=s) return n;
		if(arr[0]>s) return 0;
		
		int low = 0;
		int high = n-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
 			if(arr[mid]==s && arr[mid+1]>s) return mid+1;
			if(arr[mid]<=s) low = mid+1;
			else high = mid-1;
		}
		return 0;
	}
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7};
	int t = arr.length;
	int number= 7;
	int ans = bishu(arr,number);
	int[] res = new int[t+1];
res[0]=0;
	for(int i=1;i<=t;i++) {
		System.out.println(res[i-1] + "i-1");
		res[i] = res[i-1]+arr[i-1];
	}
	if(number!=0) {
		int r = ans>0?res[ans]:0;
		System.out.print(ans + " " + r);
	}
}
}
