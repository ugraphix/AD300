import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new FileReader("BS.txt"));
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String line = null;

		//String line = br.readLine();

		while ((line = br.readLine()) != null) {
			String []strNumbers = line.split(" ");
			for(String strNumber : strNumbers){
				numbers.add(Integer.parseInt(strNumber));
			}

			//System.out.println(line);            
		}   
		br.close();

		Collections.sort(numbers);
		System.out.println(numbers);




		Scanner numberSearch = new Scanner(System.in); 
		System.out .println("Please enter number to be searched in array (sorted order)"); 
		int key = numberSearch.nextInt(); 
		int length = 0;
		int[] strNumbers = new int[length]; 
		int index = recursiveBinarySearch(strNumbers, key); 
		if (index == -1) { 
			System.out.printf("Sorry, %d is not found in array %n", key); 
		} else { 
			System.out.printf("%d is found in array at index %d %n", key, index); 
		} 
		numberSearch.close(); 
	} 
	public static int recursiveBinarySearch(int[] strNumbers, int key) { 
		return binarySearch(strNumbers, 0, strNumbers.length - 1, key); 
	} 


	private static int binarySearch(int[] array, int start, int end, int target) { 
		int middle = (start + end) / 2; if (end < start) { 
			return -1; 
		}
		if (target == array[middle]) { 
			return middle; 
		} else if (target < array[middle]) { 
			return binarySearch(array, start, middle - 1, target); 
		} else { 
			return binarySearch(array, middle + 1, end, target); } 
	}










}
