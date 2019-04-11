package polymorphism;


class Method_current {
	
	public void curr1() {
		
		System.out.println("Hi 1");
	}
}

public class Method_OtherClass {
	
	public void other1() {
		
		Method_current obj=new Method_current();
		obj.curr1();
		System.out.println("Hi 2");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_OtherClass obj = new Method_OtherClass();
		obj.other1();
		

	}

}
