package inheritance;

class base_fifth{
	
public void show() {
		
		System.out.println("Parent");
	}
	
}

class derived_fifth extends base_fifth{
	
public void show() {
		
		System.out.println("Child");
	}


	
	
}

public class Dynamic_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		base_fifth obj ;
		obj=new base_fifth();
		obj.show();
		obj=new derived_fifth();
		obj.show();

	}

}
