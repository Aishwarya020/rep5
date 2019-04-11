package polymorphism;

public class Method_Overloading {
	
	public int area (int side) {
		
		return side*side;
		
		
	}
	
	public int area(int len, int brd) {
		
		return len*brd ;
	}
	
	public void area() {
		
		System.out.println("No parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overloading obj = new Method_Overloading();
		obj.area();
		System.out.println(obj.area(4));
		System.out.println(obj.area(2,3));

	}

}
