package SearchingAndSortingDSA450plus;

public class MiddleOfThree {
	static int middle(int a,int b , int c) {
		if(a<=b && c>=b || b<=a && b>=c) return b;
		else if(a<=c && b>=c || b<=c && a>=c) return c;
		else if(b<=a && a<=c || b>=a && a>=c) return a;
		else return -1;
	}
public static void main(String[] args) {
	int a = 9978 , b = 9018, c = 300;
	System.out.println(middle(a,b,c));
}
}
