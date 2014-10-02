
public class Arrays {
	public static void main(String[] args){
		int array[] = new int[10];
		
		array[0] = 87;
		array[1] = 543;
		array[9] = 65;
		
		System.out.println(array[1]);
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
