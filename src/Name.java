
public class Name {
	private String girlName;
	
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void display(){
		System.out.printf("Your first GF was %s", getName());
	}
}
