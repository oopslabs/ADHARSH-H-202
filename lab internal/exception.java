package CO4.CO4QN7;
import java.util.*;
 class studException extends Exception{
	studException(String s) {
		super(s);
	}
	
}

public class Stud {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of student");
		System.out.println("enter the mark 1");
		int a = sc.nextInt();
		System.out.println("enter the mark 2");
		int b = sc.nextInt();
		System.out.println("enter the mark 3");
		int c = sc.nextInt();
		double avg = (a+b+c)/3;
		double percentage = (avg/100)*100;
		try{
			if(percentage<40){
				throw new studException("Failed");
			}
			else{
				System.out.println("The percentage mark ="+percentage+"%");
			}
		}
		catch(studException e){
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
