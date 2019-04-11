package inheritance;

class Base{
	
	public void base() {
		
		System.out.println("Base");
	}
	
}

class Derived extends Base{
	
	public void base() {
		
		super.base();
		System.out.println("This is Derive");
	}
	
	
}

public class Supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived obj= new Derived();
		obj.base();

	}

}
