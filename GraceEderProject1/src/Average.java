import java.util.Scanner;
class Average{

	public static void main(String[] args) {

		//loop to restart program 
		Scanner scan = new Scanner(System.in);
		boolean stop = false;    
		while(!stop) {

			
			Scanner in=new Scanner (System.in);
			int num[]=new int[10];
			int average=0;
			int i=0;
			int sum=0;

			//ask user to enter number
			for (i=0;i<num.length;i++) {
				System.out.println("Please enter a number");
				//allow user to enter number, store number in variable
				num[i]=in.nextInt();
				sum=sum+num[i];
			}
			
			//calculate average
			average=sum/10;
			//give average to user
			System.out.println("The average of all numbers entered is = "+average);
			//ask user to run again
			System.out.println("Would you like to continue? (yes or no)");
			String s = scan.nextLine();
			//if statement for when user doesnt want to run program again
			if(s.equals("no")) {
				stop = true;
			}
		}
	}
}
