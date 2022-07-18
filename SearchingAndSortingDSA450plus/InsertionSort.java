package SearchingAndSortingDSA450plus;

public class InsertionSort {
	static void insertionSort(int[]arr) {
		int n = arr.length-1;
		for(int i=1;i<=n;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= temp;
		}
	}
	static void printArray(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	int[] arr = {8,4,1,5,9,2};
	insertionSort(arr);
	printArray(arr);
   } 
 }