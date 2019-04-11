package inheritance;

import java.util.Scanner;

class Parentv3{
	
	int num1,num2;
	Scanner obj = new Scanner(System.in);
	public void print() {
		
		System.out.println("Enter 1st number: ");
		num1=obj.nextInt();
		
		System.out.println("Enter 2nd number: ");
		num2=obj.nextInt();
	}
}

class Childv1 extends Parentv3 {
	
	public void print_sum() {
		
		
		
		int sum=num1+num2 ;
		
		System.out.println("The sum is:" +sum);
	}
	
}

public class Add_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Childv1 obj1=new Childv1();
		
		obj1.print();
		obj1.print_sum();

	}

}
