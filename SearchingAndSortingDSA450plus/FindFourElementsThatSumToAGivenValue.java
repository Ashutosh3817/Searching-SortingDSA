package SearchingAndSortingDSA450plus;

             //Brute Force Approach
public class FindFourElementsThatSumToAGivenValue {
	static void fourElements(int[] arr , int n , int x ) {
		for(int i=0;i<n-3;i++) {
			for(int j = i+1;j<n-2;j++) {
				for(int k=j+1;k<n-1;k++) {
					for(int l = k+1;l<n;l++) {
						if(arr[i]+arr[j]+arr[k]+arr[l] ==x) {
							System.out.println(arr[i] + " " + arr[j]+ " "+arr[k] +" "+arr[l]);
						
						}
					}
				}
			}
		}
	}
public static void main(String[] args) {
	int[] arr  = {1,4,45,6,10,12};
	int n = arr.length;
	int x = 21;
	fourElements(arr,n,x);
}
}
