package anagrams;

public class WordList {
  public Word head = null;
  
  public void insert(Word newword, int hashkey){
	  Word previous = null;
	  Word current = head;
	  
	  newword.key = hashkey;
	  
	  while (current != null && newword.key > current.key){
		  previous = current;
		  current = current.next;
	  }
	  
	  if(previous == null){
		  head = newword;
	  }
	  else{
		  current.next = newword;
	  }
	  
	  newword.next = current;
  }
}
