import java.util.*;
public class product {
	
	int pcode;
	String pname;
	int price;
	public static void main(String arg[])
	{
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Product 1 \n");
		obj1.pcode = scan.nextInt();
		scan.nextLine();
		obj1.pname = scan.nextLine();
		obj1.price = scan.nextInt();
		
		
		System.out.println("Product 2 \n");
		obj2.pcode = scan.nextInt();
		scan.nextLine();
		obj2.pname = scan.nextLine();
		obj2.price = scan.nextInt();
		
		System.out.println("Product 3 \n");
		obj3.pcode = scan.nextInt();
		scan.nextLine();
		obj3.pname = scan.nextLine();
		obj3.price = scan.nextInt();
		
		
		if(obj1.price < obj2.price)
		{
			System.out.println(obj1.pname +"\t has lower price");
		}
		else if(obj2.price < obj3.price)
		{
			System.out.println(obj2.pname +"\t has lower price");
		}
		else{
			System.out.println(obj3.pname +"\t has lower price");
			
		}

		
		
		
		
		
	}

}
