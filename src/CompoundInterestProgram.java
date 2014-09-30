
public class CompoundInterestProgram {
	public static void main(String[] args){
		// A=P(1+R)^n
		
		double amount;
		double principal;
		double rate;
		
		principal = 10000;
		rate = 0.01;
		
		for(int day = 1; day <= 20; day++){
			amount = principal * Math.pow(1 + rate, day);
			System.out.println(day + "   " + amount);
		}
	}
}
