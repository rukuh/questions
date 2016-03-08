package anagrams;

public class Word {
  String word;
  String sortWord;
  
  public int key;
  
  public Word next;
  
  public Word(String word, String sortWord){
	  this.word = word;
	  this.sortWord = sortWord;
  }
  
  public String getWord(){
	  return this.word;
  }
  
  public String getSortWord(){
	  return this.sortWord;
  }
}
