package encapsulation;

 class Encap{

	private int i ;
	private float f;
	private double d;
	
	
	
	
	public int getI() {
		return i;
	}




	public void setI(int i) {
		this.i = i;
	}




	public float getF() {
		return f;
	}




	public void setF(float f) {
		this.f = f;
	}




	public double getD() {
		return d;
	}




	public void setD(double d) {
		this.d = d;
	}
	
}

	public class Encapsulation_basics{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap obj = new Encap();
		obj.setI(10);
		obj.setF(20.20f);
		obj.setD(40.64);
		
		System.out.println(obj.getI());
		System.out.println(obj.getF());
		System.out.println(obj.getD());
		

	}

}
