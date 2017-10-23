import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Project3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Double> text = new TreeMap<String, Double>();
		ValueComparator s = new ValueComparator(text);
		Map<String, Double> sorted = new TreeMap<String, Double>(s);
		//read all of the words into one treemap
		Scanner sc = new Scanner(new File("agile_manifesto.txt"));
		while (sc.hasNext()) {
			String word = sc.next();
			if (text.containsKey(word)) {
				//if seen this word before, increase by count 1
				Double count = text.get(word);
				//put all words to lower case, and removes punctuation
				text.put(word.trim().toLowerCase().replaceAll("\\p{Punct}+", ""), count + 1);
			}else {
				//never seen this word before
				text.put(word.trim().toLowerCase().replaceAll("\\p{Punct}+", ""), (double) + 1);
			}
		}
		
		sc.close();
		
		//removes trailing zeroes
		DecimalFormat format = new DecimalFormat("0.#");
		
		System.out.println("Alphabetically:");
		
		//creating new set of words
		Set set = text.entrySet();
		
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+ " occurs  " + format.format(me.getValue()) + " times");
		}
		
		sorted.putAll(text);
		System.out.println();
		
		System.out.println("By number of occurance:");
		
		Set set2 = sorted.entrySet();
		Iterator j = set2.iterator();
		
		while(j.hasNext()) {
			Map.Entry me2 = (Map.Entry)j.next();
			System.out.println(me2.getKey() + " occurs " + format.format(me2.getValue()) + " times");
		}
	}
		
}

class ValueComparator implements Comparator <String>{
	Map<String, Double> base;
	
	public ValueComparator(Map<String, Double> base) {
		this.base = base;
	}
	
	public int compare (String a, String b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		}else {
			return 1;
		}//returning 0 would merge keys
	}
}