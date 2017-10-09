import java.util.Scanner;
class Average{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		boolean stop = false;    
		while(!stop) {

			Scanner in=new Scanner (System.in);
			int num[]=new int[10];
			int average=0;
			int i=0;
			int sum=0;

			for (i=0;i<num.length;i++) {
				System.out.println("Please enter a number");
				num[i]=in.nextInt();
				sum=sum+num[i];
			}
			average=sum/10;
			System.out.println("The average of all numbers entered is = "+average);
			System.out.println("Would you like to continue? (yes or no)");
			String s = scan.nextLine();
			if(s.equals("no")) {
				stop = true;
			}
		}
	}
}
