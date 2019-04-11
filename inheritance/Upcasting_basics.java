package inheritance;

class base_fourth {

	public void show() {
		
		System.out.println("Parent");
	}
	
}

class derived_fourth extends base_fourth{
	
	public void show() {
		
		System.out.println("Child");
	}
	
	public void print() {
		
		System.out.println("Hi This Is Child");
	}
	
	
}



public class Upcasting_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		base_fourth obj=new base_fourth(); //static binding
		obj.show();
		base_fourth obj1 = new derived_fourth (); //dynamic binding--> upcasting
		obj1.show();
		
		derived_fourth obj2=(derived_fourth)obj1; //downcasting
		obj2.print();
		
		
	}

}
