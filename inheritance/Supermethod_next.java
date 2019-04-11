package inheritance;

class Base_second{
	
	public void base() {
		
		System.out.println("Base");
	}
	
}

class Derived_second extends Base_second{
	
	public void base() {
		
		
		System.out.println("This is Derive");
	}
	
	public void derived() {
		super.base();
		System.out.println("Derived");
		
	}
	
	
}

public class Supermethod_next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived_second obj= new Derived_second();
		obj.base();
		obj.derived();

	}

}
