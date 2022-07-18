package SearchingAndSortingDSA450plus;

public class SelectionSort {
	static void selection(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
	static void printArray(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	int[] arr = {4,2,9,1,6};
	selection(arr);
	printArray(arr);
	}
}
