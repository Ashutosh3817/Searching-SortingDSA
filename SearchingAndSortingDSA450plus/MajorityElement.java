package SearchingAndSortingDSA450plus;

public class MajorityElement {
	static int majority(int nums[]) {
		int count = 0, number = 0;
		for(int num : nums) {
			if(count == 0 ) number = num;
			
			if(num==number) count++; 
			else count--;
		}
		return number;
	}
public static void main(String[] args) {
	int[] a  = {3,1,3,3,2};
	System.out.println(majority(a));
}
}
