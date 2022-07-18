package SearchingAndSortingDSA450plus;

public class SearchingInAnArrayWhereAdjacentDifferByAtmostK {
	static int search(int[] arr , int n ,int x , int k) {
		int i = k ;
		while(i<n) {
			if(arr[i] == x) return i ;
			
			i = i + Math.max(1, Math.abs((arr[i]-x)/k));
		}
		System.out.println("Number Is Not Present");
		return -1;
		
	}
public static void main(String[] args) {
	int[] arr = {6,4,5,7,7,6};
	int n = arr.length;
	int x = 6 ; 
	int k = 2;
	//search(arr,n,x,k);
	System.out.println("Element " + x + " is present at index " + search(arr,n,x,k));
    }
}
