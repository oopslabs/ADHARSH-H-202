import java.util.*;
public class employee {
	int emp_no;
	String ename;
	float eSalary;
	
	public void get(){
		Scanner s=new Scanner(System.in);
		System.out.print("ente the employee number\n");
		emp_no=s.nextInt();
		System.out.print("enter the employee name\n");
		ename=s.next();
		System.out.print("enter the salary of employee\n");
		eSalary=s.nextFloat();
	}
	public void display(){
		System.out.print("EMPLOYEE NAME\t"+ename+"\n");
	}

	public static void main(String[] args) {
		int flag=0;
		employee e[]=new employee[10];
		System.out.print("enter the number of employee\n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<n;i++){
			e[i]=new employee();
			e[i].get();
		}
		
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		System.out.print("\n----Search For Employee(enter emp_no)------\n");
		while(true){
			Scanner s1=new Scanner(System.in);
			int en=s1.nextInt();
			for(int i=0;i<n;i++){
				if(e[i].emp_no==en){
					flag=1;
					System.out.print("employee found");
					break;
				}
			}
			if(flag==0){
				System.out.print("employee not found");
			}
			
		}
		
	}

}
