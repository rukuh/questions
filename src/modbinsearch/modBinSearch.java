package modbinsearch;

public class modBinSearch {
	
	public static void main (String args[]){
		modBinSearch mbs = new modBinSearch();
		
		int[] numarr = {15,16,19,20,25,1,3,4,5,7,10,14};

		int key = 5;
		
		System.out.println(mbs.search(key,numarr,0,numarr.length-1));
	}
	
	public int search(int key, int[] numarr, int low, int high){
		int mid = (high+low)/2;
		
		System.out.println("Searching from index " + low + " to " + high);
		if (numarr[low] < numarr[mid]){
			
			search(key, numarr, 0,0 );
			
		}else if (key < numarr[mid]){
			search(key,numarr,0,0);
			
		}
		else{
			return low;
			
		}
		return -1;
		
	}
}
