
import java.util.Scanner;
public class complex {
	int r1,i1;
	static int res1;
	static int res2;
	complex()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real part ");
		r1 = sc.nextInt();
		System.out.println("Enter the imaginary part");
		i1 = sc.nextInt();
	}
	public static void main(String [] args)
	{
		complex s1=new complex();
		complex s2=new complex();
		res1 = s1.r1 + s2.r1;
		res2 = s1.i1 + s2.i1;
		 
		System.out.println("The result is:"+res1+"+"+res2+"i");	
		
	}
	
  
}
