package SearchingAndSortingDSA450plus;

public class MaximumSumSuchThatNo2ElementsAreAdjacentSTICKLERTHIEF {
	static int maximum(int[] arr , int n ) {
		int excl = 0;//incl => include
		int incl = arr[0]; //excl => exclude
		int excl_new;//excl_new => exclude new
		for(int i=1;i<n;i++) {
			excl_new = (incl>excl)?incl:excl;

			incl = excl + arr[i];
			System.out.println(incl);
			
			excl = excl_new;
		}
		return (incl>excl)?incl:excl;
	}
public static void main(String[] args) {
	int[] arr = {5,5,10,100,10,5};
	int n = arr.length;
	System.out.println(maximum(arr,n));
}
}
