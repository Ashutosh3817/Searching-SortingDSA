package SearchingAndSortingDSA450plus;

public class MissingNumberInAnAP {
	static int missing(int a,int b,int c) {
		if(c==0) {
			if(a==b) return 1;
			else return 0;
		}
		else {
			if((b-a)%c==0) return 1;
			else return 0;
		}
	}
public static void main(String[] args) {
	int a = 1,b=5,c=2;
	System.out.println(missing(a,b,c));
}
}
