package inheritance;

import java.util.Scanner;

class Grandpa
{
	
	int num1,num2;
	Scanner obj = new Scanner(System.in);
	public void print() {
		
		System.out.println("Enter 1st number: ");
		num1=obj.nextInt();
		
		System.out.println("Enter 2nd number: ");
		num2=obj.nextInt();
	}
}

class Dad extends Grandpa {
	
	public void multiply() {
		
		int prod=num1*num2 ;
		
		System.out.println("The product is :"+prod);
	}
}

class Daughter extends Dad {
	
	public void divide () {
		
		int div=num1/num2 ;
		
		System.out.println("The division gives :" +div);
		
	}
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter obj1= new Daughter ();
		
		obj1.print();
		obj1.multiply();
		obj1.divide();
		
		

	}

}
