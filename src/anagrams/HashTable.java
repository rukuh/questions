package anagrams;

public class HashTable {
	WordList[] wordarr;
	
	int arraySize;
	int itemsInArr = 0;
	
	public int hashkeyfunc(String hashword){
		int hashkeyvalue = 0;
		
		for(int i = 0 ; i<hashword.length() ; i++){
			int charcode = hashword.charAt(i) - 96;
			
			hashkeyvalue = (hashkeyvalue * 27 + charcode) % arraySize;
		}
		
		return hashkeyvalue;
	}
	
	HashTable(int size){
		arraySize = size;
		
		wordarr = new WordList[size];
		
		for (int i=0 ; i<arraySize ; i++){
			wordarr[i] = new WordList();
		}
		
		
	}
	
	
	
	public static void main (String args[]){
		String[] wordarr = {"ape","coal","last","west","lump","diary","cause","fires","reap","keel","pea","cola","salt","stew","plum","dairy","sauce","fires","pear","leek"};
		
		HashTable ht = new HashTable(40);
		System.out.print(ht.hashkeyfunc("leek"));
	}
}
