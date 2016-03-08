package quicksort;

public class QuickSort {
	void quicksort(int arr[],int left,int right){
		int index = partition(arr,left,right);
		if(left<index-1){
			quicksort(arr,left,index-1);
		}
		if(index<right){
			quicksort(arr,index,right);
		}
	}
	
	int partition(int arr[],int left, int right){
		int pivot = arr[(left+right)/2];
		
		while (left<=right){
			while(arr[left]<pivot) left++;
			while(arr[right]>pivot) right--;
			
			if (left <= right) {
                swap(arr,left,right);
				left++;
				right--;
			}
		}
		
		return left;
	}
	
	void swap(int arr[],int left, int right){
		int temp;
		
		temp = arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	public static void main(String args[]){
		QuickSort qs = new QuickSort();
		
		int arr[] = {1, 12, 5, 26, 7, 14, 3, 7, 2};
		
		qs.quicksort(arr, 1, arr.length-1);
	}
}
