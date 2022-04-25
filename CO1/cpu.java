package adh;

public class cpu {
	
	int price;
	static int no_of_cores;
	static String manufacturer;
	static int memory;
	static String ram_manufacturer;
	 
	 
	cpu(int pri)
	{
		price = pri;
	}
	static class processor {
		
		processor(int nocore,String manuf) {
			no_of_cores = nocore;
			manufacturer = manuf;
		}
		
	}
	static class ram {
		 
		ram(int mem,String manu) {
			memory = mem;
			ram_manufacturer = manu;
		}
	}
	
	void display() {
		System.out.println("CPU Details:+");
		System.out.println("Price "+price);
		System.out.println("No of cores of processor "+no_of_cores);
		System.out.println("Manufacturer "+manufacturer);
		System.out.println("Ram memory "+memory);
		System.out.println("Ram manufacturer "+ram_manufacturer);
		
	}

	public static void main(String[] args) {
		cpu obj = new cpu(10000);
		cpu.processor obj2 = new cpu.processor(8,"Acer");
		cpu.ram obj3 = new cpu.ram(16,"Acer");
		obj.display();
		
	}

}
