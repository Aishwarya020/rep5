//when we call any method inside another , the statement of the other method calling inside another 
//should be the first statement of the other method . 

package polymorphism;

import constructor.Chaining;

public class Method_Chaining {
	
	
	public void a () {
		
		System.out.println("1.Pickachoo");
	}
	
	public void b () {
		
		a();
		
		System.out.println("2.Ziggly Puff");
		
		
	}
	
	public void c() {
		
        b();
		
		System.out.println("3.Bulbasaur");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Chaining obj=new Method_Chaining();
		obj.c();

	}

}
