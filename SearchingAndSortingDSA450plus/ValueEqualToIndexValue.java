package SearchingAndSortingDSA450plus;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
	
	static ArrayList<Integer> equal(int[] array){
		ArrayList<Integer> al = new ArrayList<>();
		int repeat = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i] == i+1 )
				repeat = i;
			
				//al.add(repeat);  
		}
		al.add(repeat);
		return al;
	}
	public static void main(String[] args) {
		int[] array = {15, 2, 2, 12, 7};
		System.out.println(equal(array));
	}

}
