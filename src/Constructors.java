import java.util.Scanner;

public class Constructors {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of your first GF here: ");		
		String entry = scanner.nextLine();
		
		NameWithConstructor nameWithConstructor = new NameWithConstructor(entry);
		nameWithConstructor.display();
		
		scanner.close();
	}
}
