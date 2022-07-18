package SearchingAndSortingDSA450plus;

import java.util.Arrays;

//TC => O(n^3)
public class FindFourElementsThatSumToTheGivenValue {
	static void find4Numbers(int A[] , int n ,int k) {
		int l , r ;
		Arrays.sort(A);
		
		for(int i=0;i<n-3;i++) {
			for(int j=i+1;j<n-2;j++) {
				
				l = j+1;
				r = n-1;
		        
				while(l<r) {
					if(A[i] + A[j] + A[l] + A[r] == k) {
						System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
						l++;
						r--;
					}
					else if(A[i]+A[j]+A[l]+A[r]<k) 
						l++;
					else r--;
				}
			}
		}
	}
public static void main(String[] args) {
	int[] A = {10,2,3,4,5,7,8};
	int n = A.length;
	int k = 23;
	find4Numbers(A,n,k);
}
}
