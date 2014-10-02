
public class SummingArrayElements {
	public static void main(String[] args){
		int array[] = { 21, 16, 86, 21, 3 };
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
			sum += array[i];
		}
		
		System.out.println("The sum of these numbers = " + sum);
	}
}
