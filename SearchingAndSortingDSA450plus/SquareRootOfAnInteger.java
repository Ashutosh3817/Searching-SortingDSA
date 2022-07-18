package SearchingAndSortingDSA450plus;

public class SquareRootOfAnInteger {
	static int square(float n) {
		int a = (int) Math.abs(Math.sqrt(n));
	//	System.out.println(a);
		if(a*a == n) return a-1;
		return a;
		}
	
public static void main(String[] args) {
	int n = 20;
	System.out.println(square(n));
}
}
