import java.util.Scanner;
public class search {
	static int i,flag,x,c,a[],n;
	 
	public static void main(String args[])
	{
		System.out.println("Enter the number of elements");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		x = sc.nextInt();
		for(i=0;i<n;i++){
			if(a[i] == x)
			{
				flag = 0;
				break;
			}
		}
		if(flag == 0){
			System.out.println("Element found at position "+(i+1));
		}
		else{
			System.out.println("Element not found");
		}
	}

}

