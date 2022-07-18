package SearchingAndSortingDSA450plus;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayAccordingToCountOfSetBits {
	static void printArr(int[] arr , int n) {
		for(int i=0;i<n;i++) 
			System.out.println(arr[i] + " ");
	}
	static int[] sortBySetBitCount(int[] arr,int n ) {
		Arrays.sort(arr,new Comparator<Integer>(){
		//	@Override
			public int compare(int arg0,int arg1) {
				int c1 = Integer.bitCount(arg0);
				int c2 = Integer.bitCount(arg1);
				if(c1<=c2) return 1;
				else return -1;
			}

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return 0;
		}

			
		});
		return arr;
	}
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6};
	int n=6;
	sortBySetBitCount(arr,n);
	printArr(arr,n);
    System.out.println();	
}
}
