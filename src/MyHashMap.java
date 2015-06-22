
public class MyHashMap {

	private static final int TABLE_SIZE = 128;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static class HashEntry{
		int key;
		int value;
		public HashEntry(int key, int value){
			this.key = key;
			this.value = value;
		}
		
		public int getKey(){
			return this.key;
		}
		
		public int getValue(){
			return this.value;
		}
	}
	HashEntry[] table;
	public MyHashMap(){
		table = new HashEntry[TABLE_SIZE];
		for(int i=0;i<TABLE_SIZE;i++){
			table[i] = null;
		}
	}
	
	public void put(int key, int value){
		int hash = (key % TABLE_SIZE);
		while(table[hash]!=null && table[hash].getKey()!=key)
			hash = (hash+1)%TABLE_SIZE;
		table[hash] = new HashEntry(key, value);
	}
	
	public int get(int key){
		int hash = key % TABLE_SIZE;
		while(table[hash]!=null && table[hash].getKey()!=key)
			hash = (hash+1)%TABLE_SIZE;
		if(table[hash] == null)
			return -1;
		else
			return table[hash].getValue();
	}

}
