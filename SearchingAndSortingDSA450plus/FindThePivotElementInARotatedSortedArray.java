package SearchingAndSortingDSA450plus;

public class FindThePivotElementInARotatedSortedArray {
	static int pivot(int[]arr,int n) {
		int low=0;
		int high = n-1;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid]<arr[high]) high = mid;
			else low=mid+1;
			
		}
		return arr[high];
	}
	public static void main(String[] args) {
		int[] arr = {30,40,50,10,20};
		int n = arr.length;
		System.out.println(pivot(arr,n));
	}
}
