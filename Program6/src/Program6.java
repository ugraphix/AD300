import java.util.Scanner;
import java.util.Stack;

public class Program6 {
	final static String isMsg = " IS a palindrome";
	final static String isNotMsg = " is NOT a palindrome";


		public static void main(String[] args) {
			
			
			Scanner in = new Scanner(System.in);
			while(true){
				System.out.print("Enter a word to test whether it is a palindrome or not(type 'quit' to end.): ");
				String x = in.nextLine();
				
				IsPalindrome(x);
			}
		}


	
	public static void IsPalindrome(String x) {
		String input = x;
		String reverseInput = "";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println(x + isMsg);
        else
            System.out.println(x + isNotMsg);

    }
}




