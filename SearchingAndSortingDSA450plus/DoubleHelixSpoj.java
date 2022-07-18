package SearchingAndSortingDSA450plus;

public class DoubleHelixSpoj {
	static int helix(int[] a,int n,int[] b,int m ) {
		
		while(true) {
			if(n==0) break;
			else {
				int s1=0,s2=0;
				int i=0,j=0;
				int ma=0;
				while(i<n && j<m) {
					if(a[i]<b[j])
						s1+=a[i++];
					else if(a[i]>b[j])
						s2+=b[j++];
					else {
						ma = ma + Math.max(s1, s2)+a[i];
						s1=s2=0;
						i++;
						j++;
					}

				}
				while(i<n) s1 += a[i++];
				while(j<m) s2 += b[j++];
				ma = ma+Math.max(s1, s2);
				return ma;
				}
			
		}
		return 0;
	}
public static void main(String[] args) {
	int a[]= {3,5,7,9,20,25,30,40,55,56,57,60,62};
	int n= a.length;
	int b[]= {1,4,7,11,14,25,44,47,55,57,100};
    int m = b.length;
    System.out.println(helix(a,n,b,m)); 
}
}
