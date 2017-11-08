import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Project5 {


	public static void main(String args[]) {



		//testing our bubble sort method
		int[] unsorted = {87, 339, 12, 45, 6, 78, 80, 30, 5, 22, 19, 3, 54, 95, 20, 49, 71, 120, 400, 65, 23, 45, 8, 2, 345, 7, 4, 7, 98, 4, 2,};
		int[] mergesort = {87, 339, 12, 45, 6, 78, 80, 30, 5, 22, 19, 3, 54, 95, 20, 49, 71, 120, 400, 65, 23, 45, 8, 2, 345, 7, 4, 7, 98, 4, 2,};
		int size = mergesort.length;

		
		//set start time for measuring execution on method
		long start1 = System.nanoTime();
		bubbleSort(unsorted);
		
		//end  time for measuring execution on method
		long end1 = System.nanoTime();
		long timeInMillis1 = TimeUnit.MILLISECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS);
		System.out.println("Time spend in ms on first set: " + timeInMillis1);
		System.out.println();

		//set start time for measuring execution on method
		long start2 = System.nanoTime();
		sort(mergesort, 0, size);
		

		//end  time for measuring execution on method
		long end2 = System.nanoTime();
		long timeInMillis2 = TimeUnit.MILLISECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);
		System.out.println("Time spend in ms on second set: " + timeInMillis2);
		System.out.println();
	}   




	public static void bubbleSort(int[] unsorted){
		System.out.println("unsorted array before sorting : " + Arrays.toString(unsorted));

		// Outer loop - need n-1 iteration to sort n elements
		for(int i=0; i<unsorted.length -1; i++){

			//Inner loop to perform comparison and swapping between adjacent numbers
			//After each iteration one index from last is sorted
			for(int j= 1; j<unsorted.length -i; j++){

				//If current number is greater, swap those two
				if(unsorted[j-1] > unsorted[j]){
					int temp = unsorted[j];
					unsorted[j] = unsorted[j-1];
					unsorted[j-1] = temp;
				}
			}
			System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(unsorted));

		}
		


	}

	public static void sort(int[] test, int low, int high) 
	{
		int N = high - low;         
		if (N <= 1) 
			return; 
		int mid = low + N/2; 
		// recursively sort 
		sort(test, low, mid); 
		sort(test, mid, high); 
		// merge two sorted subarrays
		int[] temp = new int[N];
		int i = low, j = mid;
		for (int k = 0; k < N; k++) 
		{
			if (i == mid)  
				temp[k] = test[j++];
			else if (j == high) 
				temp[k] = test[i++];
			else if (test[j]<test[i]) 
				temp[k] = test[j++];
			else 
				temp[k] = test[i++];
		}    
		for (int k = 0; k < N; k++) 
			test[low + k] = temp[k];         

		System.out.println("Sorted merge:" + Arrays.toString(test));
	}



}








