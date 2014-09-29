
public class LogicOperators {
	public static void main(String args[]){
		int boy, girl;
		
		boy = 18;
		girl = 68;
		// girl = 40;
		
		// AND = both have to be true
		if(boy > 10 && girl < 60){
			System.out.println("You CAN ride the rollercoaster :)");			
		}else{
			System.out.println("You CANNOT ride the rollercoaster :(");			
		}
		
		// OR = one or both have to be true
		if(boy > 10 || girl < 60){
			System.out.println("You CAN ride the rollercoaster :)");			
		}else{
			System.out.println("You CANNOT ride the rollercoaster :(");			
		}
	}
}
