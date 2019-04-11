package inheritance;

class base_third{
	
	int num=10;
}

class derived_third extends base_third{
	
	int num=20;
	
	public void show() {
		
		System.out.println("Derived :"+num);
		System.out.println("Base :"+super.num);  //--> super keyword gives preference to immediate parent
	}
}

public class Super_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		derived_third obj=new derived_third();
		obj.show();
	}

}
