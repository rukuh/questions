package anagrams;

import java.util.Arrays;

public class Anagrams {
	
	public static void main (String args[]){
		String[] wordarr = {"ape","coal","last","west","lump","diary","cause","fires","reap","keel","pea","cola","salt","stew","plum","dairy","sauce","fires","pear","leek"};
		String[] sortarr = new String[wordarr.length];
		String[] outarr = new String[wordarr.length];
		
		char[] temp = new char[wordarr.length];
		
		for( int i=0 ; i< wordarr.length ; i++ ){
			temp = wordarr[i].toCharArray(); 
		
			Arrays.sort(temp);
		
			sortarr[i] = new String(temp);
		}
			
		System.out.println(Arrays.toString(wordarr));
		System.out.println(Arrays.toString(sortarr));
		
		int index = 0;
		
		for( int i=0 ; i < wordarr.length ; i++ ){
			for (int j=i+1 ; j < wordarr.length ; j++ ){
				if (sortarr[i].equals(sortarr[j])){					
					outarr[index] = wordarr[i];
					index++;
					outarr[index] = wordarr[j];
					index++;
				}
			}
		}
			
		System.out.println(Arrays.toString(outarr));
	}
}
