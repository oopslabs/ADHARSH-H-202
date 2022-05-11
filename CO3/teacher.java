package adharsh;
import java.util.*;
class Employees{
	public int empid;
	public String name;
	public int salary;
	public String address;
	Employees(int emp,String empname,int empsalary,String empaddress){
		empid=emp;
		name=empname;
		salary=empsalary;
		address=empaddress;
	}
}
public class teacher extends Employees {
	String department;
	String subjects;

	teacher(int emp,String empname,int empsalary,String empaddress,String dep,String sub) {
		super(emp,empname,empsalary,empaddress);
		department=dep;
		subjects=sub;
		
	}
	void display() {
		System.out.println("Teacher id :		"+empid);
		System.out.println("Teacher name :     	"+name);
		System.out.println("Teacher salary :		"+salary);
		System.out.println("Teacher address :		"+address);
		System.out.println("Teacher department :	"+department);
		System.out.println("Teacher subject :		"+subjects);
		
	}

	public static void main(String[] args) {
		teacher[] obj = new teacher[10];
        System.out.println("Enter the number of teachers : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter details of each teacher : ");

        for (int i = 1; i <= n; ++i) {

            
            System.out.println("Enter details of teacher " + i);
            System.out.println("Enter teacher number ");
            int u = input.nextInt();
            input.nextLine();
            System.out.println("Enter teacher name ");
            String v = input.nextLine();
            input.nextLine();
            System.out.println("Enter salary ");
            int w= input.nextInt();
            input.nextLine();
            System.out.println("Enter address ");
            String x= input.nextLine();
            input.nextLine();
            System.out.println("Enter department ");
            String y = input.nextLine();
            input.nextLine();
            System.out.println("Enter subjects ");
            String z= input.nextLine();
            input.nextLine();
            obj[i]=new teacher(u,v,w,x,y,z);
            
        }
        System.out.println("-----------Teacher Details--------------");
        for (int i = 1; i <= n; ++i) {
        	obj[i].display();
        	
        }
	}

}