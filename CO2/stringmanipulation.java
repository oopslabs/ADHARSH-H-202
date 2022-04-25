import java.util.*;
import java.io.*;
public class stringmanipulation {

	public static void main(String args[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();
		System.out.println("Size of the string "+str.length());
		System.out.println("The index of a is "+str.indexOf('a'));
		System.out.println("Character at position 4 is "+str.charAt(4));
		System.out.println("Compare function "+str.equals("hello"));
		System.out.println("Contain function "+str.contains("hello"));
		System.out.println("Ends with function "+str.endsWith("o"));
	}
}