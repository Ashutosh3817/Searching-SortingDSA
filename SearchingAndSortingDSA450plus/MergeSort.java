package SearchingAndSortingDSA450plus;

public class MergeSort {
	public static void merge(int[] arr,int[] temp,int left,int mid,int right) {
		int i,j,k;
		i=left;
		j=mid;
		k=left;
		while(i<=(mid-1) && j<=right) {
			if(arr[i]<arr[j]) 
				temp[k++] = arr[i++];
			
			else 
				temp[k++] = arr[j++];
			
		}
		while(i<=mid-1) 
			temp[k++] = arr[i++];
		
		while(j<=right) 
			temp[k++]=arr[j++];
		
		for(i=0;i<arr.length;i++) { 
			arr[i] = temp[i];
		
		}
	}
	
	public static void mergeSort(int arr[],int[] temp,int left,int right) {
		
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr,temp,left,mid);
			mergeSort(arr,temp,mid+1,right);
			merge(arr,temp,left,mid,right);
		}}
		public static void printArray(int[] arr) {
			for(int i=0;i<arr.length;i++) 
				System.out.println(arr[i]);
			System.out.println();
			
		}
	
	public static void main(String[] args) {
		int[] arr = {2,4,1,3,5};
		int ans = arr.length;
		int[] temp = new int[ans];
		//printArray(arr);
		mergeSort(arr,temp,0,ans-1);
		printArray(arr );
	}
}
