package SearchingAndSortingDSA450plus;

public class BookAllocationProblem {
	static int bookAllocation(int[]arr,int k) {
		int n = arr.length;
		int sum=0;
		int res=-1;
		for(int i=0;i<arr.length;i++)
			 sum +=arr[i];
		int low=arr[0];
		int high=sum;
		while(low<=high) {
			int mid = (low+high)/2;
			if(allocationIsPossible(arr,n,mid,k)) {
				res=mid;
				high = mid-1;
			}
			else low = mid+1;
		}
		return res;                     
	}
	static boolean allocationIsPossible(int[] arr,int n,int barrier, int k) {
		int allocated_student=1, pages=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>barrier) return false;
			if(pages+arr[i]>barrier) {
				allocated_student+=1;
				pages+=arr[i];
			}
			else pages+=arr[i];
		}
		if(allocated_student>k) return false;
		else return true;
	}
public static void main(String[] args) {
	int[] arr = {12,34,67,90};
	int k=2;
	System.out.println(bookAllocation(arr,k));;
}
}
