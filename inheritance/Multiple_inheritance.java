package inheritance;

import java.util.Scanner;

class mom{
	
	int num1;
	Scanner obj = new Scanner(System.in);
	public void print_mom() {
		
		System.out.println("Enter 1st number: ");
		num1=obj.nextInt();
		
	
		
	}
	
}

class  dad{
	
	int num2;
	Scanner obj = new Scanner(System.in);
	public void print_dad() {
		
		
		
		System.out.println("Enter 2nd number: ");
		num2=obj.nextInt();
		
	}
	
}

/*class baby extends dad  {
	
{
	
	public void oper_one() {
		
		int product= num1*num2 ;
		
		System.out.println("The product is :"+product);	
		
	}

}*/
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	baby obj=new baby();
		obj.print_mom() ;
		obj.print_dad();
		obj.oper_one();*/

	}

}
