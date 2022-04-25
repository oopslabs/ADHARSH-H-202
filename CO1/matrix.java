
import java.util.Scanner;
public class matrix {
	

	public static void main(String[] args) {
		
int a[][] = new int[3][3];
int b[][] = new int[3][3];
int res[][] = new int[3][3];
Scanner in = new Scanner(System.in);
System.out.println("enter the elements of first matrix");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		a[i][j] = in.nextInt();
	}
}
System.out.println("enter the elements of second matrix");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		b[i][j] = in.nextInt();
	}
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		res[i][j] = a[i][j]+b[i][j];
		System.out.print(res[i][j]+"\t");
	}
	System.out.println();
}





	}

}
