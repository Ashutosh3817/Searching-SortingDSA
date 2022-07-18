package SearchingAndSortingDSA450plus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class JobSchedulingAlgorithm {
	private static class Job{
		
	    private int startTime;
	    private int endTime;
	    private int profit;
	
	  public Job(int sT,int eT,int p) {
		  this.startTime = sT;
		  this.endTime = eT;
		  this.profit = p;
	  }
  }
	  static  int jobScheduling(int[] startTime,int[] endTime,int[] profit) {
		List<Job> al = new ArrayList<>();
		for(int i=0;i<startTime.length;i++) {
			al.add(new Job(startTime[i],endTime[i],profit[i]));
		}
		Collections.sort(al,(a,b)->(a.endTime-b.endTime));
		//1,2,3,4,6
		//3,5,6,9,10
		//20,20,100,70,60
		TreeMap<Integer,Integer> map = new TreeMap<>();
		int ans=0;
		for(Job currJob:al) {
			Integer entryTillStartTime = map.floorKey(currJob.startTime);
			//System.out.println(map.floorKey(6));
			//System.out.println(entryTillStartTime + " ,ET");
			Integer maxProfitTillStartTime = entryTillStartTime==null?0:map.get(entryTillStartTime) ;
			//System.out.println(maxProfitTillStartTime + " ,mp");
			ans = Math.max(ans,maxProfitTillStartTime+currJob.profit);
			//System.out.println(ans + " ,ans");
			map.put(currJob.endTime, ans);
			System.out.println(map.get(3) + " ,3");
			System.out.println(map.get(5) + " ,5");

			System.out.println(map.get(6) + " ,6");

			System.out.println(map.get(9) + " ,9");

			System.out.println(map.get(10) + " ,10");
		}
		return ans;
	}
public static void main(String[] args) {
	int[] startTime= {1,2,3,4,6};
	int[] endTime = {3,5,6,9,10};
	int[] profit = {20,20,100,70,60};
	System.out.println(jobScheduling(startTime,endTime,profit));
	
}
}
