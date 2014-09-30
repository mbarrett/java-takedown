import java.util.Scanner;

public class MethodsAndInstances {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of your first GF here: ");		
		String entry = scanner.nextLine();
		
		Name name = new Name();
		name.setName(entry);
		name.display();
		
		scanner.close();
	}
}	
