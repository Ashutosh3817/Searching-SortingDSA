package SearchingAndSortingDSA450plus;

public class QuickSort {
	
	static int Partition(int[]arr,int l , int h) {
		int i = l;
		int j=h;
		int pivot = arr[l];
		while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>=pivot)j--;
			if(i<j)
				swap(arr,i,j);
		}
		    if(i>j) {
		       swap(arr,j,l);
		       }
			System.out.println(j);
		      return j;
	}
	
		static void swap(int[]arr,int i,int j) {
			int temp = arr[i+1];
			arr[i+1] = arr[j];
			arr[j] = temp;
			//System.out.println(arr[j]);
			
		}
		static void quickSort(int[] arr , int l,int h) {
			
			 if(l<h) {
				 int pivot = Partition(arr,l, h);
				 quickSort(arr,l,pivot-1);
				 quickSort(arr,pivot+1,h);
			 }
		}
		static void printArray(int arr[])
		{
			int n = arr.length;
			for (int i=0; i<n; ++i)
				System.out.print(arr[i]+" ");
			System.out.println();
		}

		
public static void main(String[] args) {
	int[] arr= {4,6,2,5,7,9,1,3};
	int h = arr.length;
	int l=0;
	quickSort(arr,l,h-1);
	printArray(arr);
	
}
}
