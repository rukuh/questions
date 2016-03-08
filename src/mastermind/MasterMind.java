package mastermind;

public class MasterMind {
	public static void main (String args[]){
		MasterMind mm = new MasterMind();
		
		int output[] = mm.result("GGRR","RGBY");
		
		System.out.print(output[0] + " and " + output[1]);
	}
	
	public int[] result(String guess, String soln){
		String g = guess;
		String s = soln;
		char[] gc = g.toCharArray();
		char[] sc = s.toCharArray();
		int hits=0,psuedohits = 0;
		
		for(int i=0;i<gc.length;i++){
			System.out.println("Guess " + i + " is " + gc[i] + " compared to " + sc[i]);
			if(gc[i]==sc[i]){
				System.out.println("hit!");
				hits++;
				continue;
			} else{
				for(int j=0;j<sc.length;j++){
					System.out.println("Guess " + i + " is " + gc[i] + " compared to Solution " + j + " is " + sc[j]);
					if(gc[i]==sc[j]){
						System.out.println("psuedohit!");
						psuedohits++;
						break;
					}
				}
			}
		}
		
		int result[] = {hits,psuedohits};
		
		return result;
	}
}
