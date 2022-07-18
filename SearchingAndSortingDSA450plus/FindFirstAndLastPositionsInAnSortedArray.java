package SearchingAndSortingDSA450plus;

import java.util.ArrayList;

public class FindFirstAndLastPositionsInAnSortedArray {
	
	public static ArrayList<Integer> positions(int[] array, int target) {
		ArrayList<Integer> al = new ArrayList<>();
		int n = array.length;
		int l=0 , r=n-1;
		int first = -1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(array[mid]< target)
				l = mid+1;
			else if(array[mid] > target)
				r = mid-1;
			else {
				 first  = mid;
				 r = mid-1;
				 
		
			}
						
		}
		al.add(first);

		
		 l=0 ; r = n-1;
		 int last =-1;
		 while(l<=r) {
			 int mid = l + (r-l)/2;
			 if(array[mid]>target)
				 r = mid-1;
			 else if(array[mid]<target)
				 l = mid+1;
			 else {
				 last = mid;
				 l = mid+1;
			 }
				 
				 
		 }
		 al.add(last);
		 return(al);
		 //System.out.println(last);

	}


public static void main(String[] args) {
	int[] nums = {1,3,5,5,5,5,6,7,123,124};
	int target = 5;
	System.out.println(positions(nums,target));

}}
