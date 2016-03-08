package small_unsorted;

public class SmallUnsorted {
	public int[] unsorted(int[] arr,int left,int right){
		int[] result = new int[2];
		for(int i=left;i<right;i++){
			for(int j=i+1;j<right;j++){
				if(arr[i]>=arr[j]){
					System.out.println("Arr[" + i + "] is " + arr[i] + " and Arr[" + j + "] is " + arr[j]);
					
					System.out.println(i + " and " + j);
					
					result[0] = i;					
				}
			}
			
			result[1] = unsorted(arr,right,arr.length)[1];			
		}		
		return result;
	}
	
	public static void main (String args[]){
		SmallUnsorted s = new SmallUnsorted();
		
		int[] arr = {1,2,4,7,10,11,7,12,6,7,16,18,19};
		
		int[] result = s.unsorted(arr,0,arr.length);
		
		System.out.print(result[0] + " and " + result[1]);		
	}
}
