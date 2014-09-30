import java.util.Scanner;

public class MethodsWithParameters {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your message here: ");
		String message = scanner.nextLine();
		
		YetAnotherClass yetAnotherClass = new YetAnotherClass();
		yetAnotherClass.simpleMessage(message);
		
		scanner.close();
	}
}
