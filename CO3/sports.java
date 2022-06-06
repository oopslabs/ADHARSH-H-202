package adharsh;
import java.util.*;
interface student{
	String name="Afeef";
	int mark1=100;
	
}
interface sport{
	int sport_id=151;
	String sport="football";
	
	
}
public class sports implements student,sport{
	
	void display() {
		System.out.print(" name: "+name+"\n acadamic mark: "+mark1+"\n sport :"+sport+"\n sport mark :"+sport_id);
		
	}

	public static void main(String args[]) {
		
		sports res=new sports();
		
		System.out.println("-------student  Details--------");
		res.display();
		
		

	}

}