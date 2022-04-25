import java.util.Scanner;
public class symmetric {
	static int r,c;
	
	public static void main(String[] args)
	{
		int i,j;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the row");
		r = in.nextInt();
		System.out.println("Enter the size of the column");
		c = in.nextInt();
		System.out.println("Enter the elements:");
		int a[][]= new int[r][c];
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				a[i][j] = in.nextInt();
			}
		}
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
			}
		
		int flag = 0;
		for(i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				if(a[i][j]!=a[j][i]) {
					flag = 1;
				}
			}
		}
		if(flag == 0) {
			System.out.println("The matrix is symmetric");
		}
		else {
			System.out.println("The matrix is not symmetric");
		}
	}

}
