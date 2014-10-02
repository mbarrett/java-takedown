import java.util.Random;

public class ArraysAsCounters {
	public static void main(String[] args){
		Random random = new Random();
		int frequency[] = new int[7];
		
		for(int diceRoll = 1; diceRoll < 1000; diceRoll++){
			int number = random.nextInt(6) + 1;
			++frequency[number];
		}
		
		System.out.println("Dice number\tFrequency");
		
		for(int diceNumber = 1; diceNumber < frequency.length; diceNumber++){
			System.out.println(diceNumber + "\t\t" + frequency[diceNumber]);
		}
	}
}
