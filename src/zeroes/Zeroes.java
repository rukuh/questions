package zeroes;

public class Zeroes {
	public static void main (String args[]){
		Zeroes z = new Zeroes();
		
		//System.out.print(z.zeroes(4617));
		
		System.out.println();
	}
	
	public int zeroes(int n){
		int i=1,zeroes=0;
		
		while( n/Math.pow(5,i) > 0) {
			zeroes += n/Math.pow(5,i);
			i++;
		}
		
		return zeroes;
	}
}
