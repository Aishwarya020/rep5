package inheritance;

class Parent{
	
	public void flat() {
		
		System.out.println("Flat 1");
	}
}

class Child extends Parent {
	
	public void car() {
		
		System.out.println("Car 1");
	}
}

public class SingleLevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child ();
		obj.flat();
		obj.car();

	}

}
