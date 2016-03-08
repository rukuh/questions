package HashTable;

public class HashTable {
	class HashTableNode{
		Object key;
		Object data;
		
		public HashTableNode(){
			this.key = null;
			this.data = null;
		}
		
		public HashTableNode(Object inKey, Object data){
			this.key = inKey;
			this.data = data;
		}
		
		public Object getData(){
			return data;
		}
		
		public void setData(Object data){
			this.data = data;
		}
		
		public Object getKey(){
			return key;
		}
		
		public void setKey(Object key){
			this.key = key;
		}
		
		public boolean equals(Object obj){
			if(obj instanceof HashTableNode){
				HashTableNode node = (HashTableNode)obj;
				return this.key.equals(node.getKey());
			} else{
				return false;
			}
		}
		
		public String toString(){
			return "Key: [" + this.key + "] data: [" + this.data + "]"; 
		}
	}
}
