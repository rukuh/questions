package LinkedList;

public class LinkedList {
	LinkNode head;
	
	public LinkedList(){
		head = null;
	}
	
	public void add(String item){
		LinkNode newNode = new LinkNode(item);
		LinkNode current = head;
		
		if( current == null ){
			head = newNode;			
		}else{
			while(current.next != null){
				current = current.next;
			}
			
			current.next = newNode;
			newNode = current;
		}			
	}
	
	public static void main (String args[]){
		LinkedList myList = new LinkedList();
		
		myList.add("Dog");
		myList.add("Cat");
		myList.add("Bear");
		myList.add("Raccoon");
		
		LinkNode current = myList.head;
		
		while (current != null){
			current.display();
			current = current.next;
		}
	}
}
