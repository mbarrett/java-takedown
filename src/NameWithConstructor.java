
public class NameWithConstructor {
	private String girlName;
	
	public NameWithConstructor(String name){
		girlName = name;
	}
	
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
