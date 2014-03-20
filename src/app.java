import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		String stringIn;
		System.out.print("Insert Text Here: ");
		stringIn = userInput.next();
		
		char[] charArray = stringIn.toCharArray();
		
		for(int i = stringIn.length()-1 ;i>=0;i--) {
			System.out.print(charArray[i]);
		}
	}
}
