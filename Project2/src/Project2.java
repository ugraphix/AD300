import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Project2 {

	public static void main(String[] args) throws FileNotFoundException {
		//read all of the words into one ArrayList
		Scanner s = new Scanner(new FileReader("words.txt"));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
			list.add(s.next());
		}

		System.out.println("List of words from the file: " );
		System.out.println(list);
		System.out.println();

		//read file into map
		Scanner d = new Scanner(new FileReader("words.txt"));
		Map<String, Integer> wordCountMap = getCountMap(d);
		for (String word: wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			if (count > 1 ) {
				System.out.println(word + " occurs " + count + " times.");
			}
		}

		//interrogate the ArrayList and remove all duplicate words
		Scanner m = new Scanner(new FileReader("words.txt"));
		ArrayList<String> notDuplicate = new ArrayList<String>(); 
		while (m.hasNext()) {
			String word = m.next();
			//count words
			int count = wordCountMap.get(word);
			//if word is duplicate
			if ( count  == 1 ) {
				notDuplicate.add(word);
			}
		}

		//print words that are not duplicates
		System.out.println();
		System.out.println();
		System.out.println("The new list with all of the duplicate words removed: ");
		System.out.println(notDuplicate );
	}

	//reads file text and returns a map from words to counts
	private static Map<String, Integer> getCountMap(Scanner d) {
		Map<String, Integer> wordCountMap = new TreeMap <String, Integer>();
		while (d.hasNext()) {
			String word = d.next().toLowerCase();
			if (wordCountMap.containsKey(word)) { 
				//seen this word as duplicates
				int count = wordCountMap.get(word);
				wordCountMap.put(word,  count + 1);
			}else {
				//not duplicate
				wordCountMap.put(word, 1);
			}
		}
		return wordCountMap;
	}
}