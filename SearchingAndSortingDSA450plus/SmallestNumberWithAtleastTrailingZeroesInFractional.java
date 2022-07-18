package SearchingAndSortingDSA450plus;

public class SmallestNumberWithAtleastTrailingZeroesInFractional {
	static int findNum(int n) {
		if(n==1) return 5;
		
		int low=0;
		int high = 5*n;
		while(low<high) {
			int mid =(low+high)/2;
			//System.out.println(mid);
			if(check(mid,n)) 
				high=mid;
		
			else {
				low=mid+1;
			//	System.out.println(low);

			}
			
		}
		return low;
	}
	static boolean check(int mid,int n) {
		int temp = mid;
		int count=0;
		int f=5;
		while(f<=temp) {
			count+=temp/f;
			f=f*5;
		}
		return (count>=n);
	}
public static void main(String[] args) {
	int n=5;
	System.out.println(findNum(n));
}
}
