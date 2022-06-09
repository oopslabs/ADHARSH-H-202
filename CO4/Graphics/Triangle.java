package Graphics;
import java.util.*;

public class Triangle {

	public void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height of triangle");
		 int height = sc.nextInt();
		 System.out.println("enter the beadth of triangle");
		 int breadth = sc.nextInt();
		 double area = 0.5*(height*breadth);
		System.out.println("the area of the Triangle is:"+area);
		
	
	}

}