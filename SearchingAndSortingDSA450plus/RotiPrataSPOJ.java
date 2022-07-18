package SearchingAndSortingDSA450plus;

public class RotiPrataSPOJ {
	static double prata(int[]a,int par,int t) {
		
		while(t-->0) {
				double lb=0;
				double ub=1e8;
				double ans=0;
				int n=a.length;
				while(lb<=ub) {
					double mid=(lb+ub)/2;
					if(solve(a,n,par,mid)) {
						ans=mid;
						ub=mid-1;
					}
					else lb = mid+1;
				}
				return ans;
		}
		return 0;
	}
	static boolean solve(int[] a,int n,int par,double mid) {
		int time=0;
		int parata=0;
		for(int i=0;i<n;i++) {
			time=a[i];
			int j=2;
		while(time<=mid) {
			parata++;
			time = time + (a[i]*j);
			System.out.println(time);
			j++;
		}
		if(parata>par) return true;
		}
		return false;
	}
public static void main(String[] args) {
	int[]a = {1,2,3,4};
	int p=10;
	int t=3;
	System.out.println(prata(a,p,t));
}
}
