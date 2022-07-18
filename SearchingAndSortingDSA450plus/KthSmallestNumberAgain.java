package SearchingAndSortingDSA450plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthSmallestNumberAgain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<ArrayList<Long>> li = new ArrayList<ArrayList<Long>>();
			
			for(int i=0;i<n;i++) {
				ArrayList<Long> al = new ArrayList<>();
				long a = sc.nextLong();
				long b  = sc.nextLong();
				al.add(a);
				al.add(b);
				li.add(al);
				
			}
			Collections.sort(li,new Comparator<ArrayList<Long>>() {
				public int compare(ArrayList<Long> o1,ArrayList<Long>o2) {
					return o1.get(0).compareTo(o2.get(0));
				}
			});
			
		}
	}
}
