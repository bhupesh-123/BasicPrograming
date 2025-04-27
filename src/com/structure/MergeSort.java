package com.structure;

public class MergeSort {
	public static void main(String[] args) {
		 int[] actual = { 5, 1, 6, 2, 3, 4 };
		 mergeSort(actual,actual.length);
		 printArray(actual);
		 
	}
public static void mergeSort(int arr[] ,int n){
	if(n<2){
		return;
	}
	int mid;
	
	mid=n/2;
	int[] leftArr=new int[mid];
	int[] rightArr=new int[n-mid];

	for(int i=0;i<mid;i++){
		leftArr[i]=arr[i];
	}
	for (int i = mid; i < n; i++) {
        rightArr[i - mid] = arr[i];
    }
mergeSort(leftArr, mid);	
mergeSort(rightArr, n-mid);
merge(arr,leftArr,rightArr,mid,n-mid);

}
static void printArray(int arr[])
{
    int n = arr.length;
    for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}
public static void merge(int[] arr,int leftArr[],int rightArr[],int mid,int n){
	 int i = 0, j = 0, k = 0;
	    while (i < mid && j < n) {
	        if (leftArr[i] <= rightArr[j]) {
	            arr[k++] = leftArr[i++];
	        }
	        else {
	            arr[k++] = rightArr[j++];
	        }
	    }
	    while (i < mid) {
	        arr[k++] = leftArr[i++];
	    }
	    while (j < n) {
	        arr[k++] = rightArr[j++];
	    }
}


}
