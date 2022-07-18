package SearchingAndSortingDSA450plus;

public class BubbleSort {
	static void bubbleSort(int[] arr,int l,int h) {
		//int l = i;
		//int h = j;
		while(l<h) {
			for(int i=0;i<h;i++) {
				for(int j=0;j<h-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
					    arr[j+1]=temp;
					}
				}
			}
		}
	}
	static void printArray(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	int[] arr = {1,5,7,4,3};
	int l=0;
	int h=arr.length-1;
	bubbleSort(arr,l,h);
	printArray(arr);
}
}
