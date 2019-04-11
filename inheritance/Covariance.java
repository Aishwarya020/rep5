package inheritance;

class P{
	
	public P a() {
		
		System.out.println("Its First");
		
		return new P();
	}
}

class Q extends P{
	
	public Q a() {
		
		System.out.println("Its second");
		
		return new Q();
	}
}

public class Covariance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Q obj2=new Q();
		
		
		obj2.a();

	}

}
