package inheritance;

class marks{
	
	int math,sci,eng;
	public void get(int math,int sci,int eng) {
		
		this.math=math ;
		this.sci=sci;
		this.eng=eng;
	}
}

class students{
	
	int rno;
	marks m;
	
	public void info(int rno,marks m) {
		
		System.out.println("Rno: "+rno);
		System.out.println(m.math+" "+m.sci+" "+m.eng);
		
	}
}
public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
marks m = new marks();
m.get(10, 20, 30);
students s=new students();
s.info(1, m);
		
	}

}
