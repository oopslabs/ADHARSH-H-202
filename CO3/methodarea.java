
	
public class methodarea{
	void area(int d){
		int sq = d*d;
		System.out.println("The area of square is "+sq);
	}
	void area(int x,int y){
		int rect = x*y;
		System.out.println("The area of rectangle is "+rect);
		
	}
	void area(double r){
		
		System.out.println("The area of circle is "+3.14*r*r);
	}
	
public static void main(String args[]){
	methodarea obj = new methodarea();
	obj.area(2);
	obj.area(4,8);
	obj.area(1.2);
	
}
	
}