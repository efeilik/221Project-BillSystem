import java.util.Scanner;

public class GasBill extends Bill implements USESM3{

	private double usedM3;
	private final double DOLLAR = 18.5;
	
	private final double UNITPRICE = 5;
	
	public GasBill() {}
	
	public GasBill(String beginDate, String endDate, int billID, String billDueDate, double usedM3) {
		super(beginDate,endDate,billID,billDueDate);
		this.usedM3=usedM3;
		
	}
	
	public void getInput() {
		
		super.getInput();
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter used m3: ");
		usedM3=Double.parseDouble(inp.nextLine());
		
		
	}
	
	
	//getter and setter
	public double getUsedM3() {
		return usedM3;
	}

	public void setUsedM3(double usedM3) {
		this.usedM3 = usedM3;
	}
	
	public String toString() {
		return super.toString() + "Used M3: " + usedM3;
	}
	
	public void calculatePrice() {
		super.setBillPrice((usedM3*UNITPRICE)+calculateStoragePrice());
		System.out.println("Price has calculated!");
	}

	
	public double calculateStoragePrice() {
		//Because it is coming from another country storage price is calculated by dollar
		return (usedM3*USESM3.fixStoragePrice*DOLLAR);
	}
	
}
