import java.util.Scanner;


public class Calculator {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber, secondNumber, answer;
		
		System.out.println("Enter first number: ");
		firstNumber = scanner.nextDouble();
		
		System.out.println("Enter second number: ");
		secondNumber = scanner.nextDouble();		
		
		answer = firstNumber + secondNumber;
		System.out.println(answer);
		
		scanner.close();
	}
}
