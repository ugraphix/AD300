import java.util.ArrayList;

public class Project10 {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		//construct list
		
		ArrayList set = new ArrayList();
		
		//add 64, 12, 84, 1, 31, 63, 99, 14, 38 to set
		set.add(64);
		set.add(12);
		set.add(84);
		set.add(1);
		set.add(31);
		set.add(63);
		set.add(99);
		set.add(14);
		set.add(38);
		
		//report results
		System.out.println("set = " + set);
	}
	
	public class HashIntSet implements IntSet {
	  private int[] elements;
	    private int size;
	    
	    

	    // constructs new empty set
	    public HashIntSet() {
	        elements = new int[10];
	        size = 0;
	        
	        
	    }

	    // hash function maps values to indexes
	    private int hash(int value) {
	        return Math.abs(value) % elements.length;
	    }

}
	
	public void add(int value) {
	    int h = hash(value);
	    int[] elements = null;
		while (elements[h] != 0 && 
	           elements[h] != value) {      // linear probing
	        h = (h + 1) % elements.length;  // for empty slot
	    }
	    if (elements[h] != value) {         // avoid duplicates
	        elements[h] = value;
	        int size = 0;
			size++;
	    }
	}

	private int hash(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

}






