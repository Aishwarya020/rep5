package polymorphism;


class pokemon{
	
	public void show() {
		
		System.out.println("Hi");
		
	}
}
class pikachoo extends pokemon{
public void show() {
	
	System.out.println("Hi 1  -- i overrode Hi");
}

public void print() {
	
	System.out.println("Pika pika :p ");
}
}

public class Overriding_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pikachoo obj=new pikachoo();
		obj.show();
		obj.print();

	}

}
