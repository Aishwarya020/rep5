package inheritance;

class base{
	
	base(){
		
		System.out.println("Hi this is base class ");
	}
}

class derived extends base{
	
	derived(){
		
		//super(5);
		System.out.println("This is derived");
	}
	
	
}

public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		derived obj=new derived();
	}

}
