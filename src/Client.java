import java.util.Scanner;

public abstract class Client {

	protected int clientID;
	protected String address;
	protected double taxPercentage;
	protected double totalBill;
	protected ElectricityBill EBill;
	protected GasBill GBill;
	protected WaterBill WBill;
	
	protected static int numberOfClients = 0;
	
	public Client() {
		WBill=new WaterBill();
		EBill=new ElectricityBill();
		GBill=new GasBill();
		numberOfClients++;
	}
	
	public Client(int clientID, String address) {
		this();
		this.clientID=clientID;
		this.address=address;
				
	}
	
	public static int getNumberOfClients() {
		return numberOfClients;
	}

	public void getInput() {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("\nEnter address: ");
		address=inp.nextLine();
		
		System.out.println("Enter tax percentage: ");
		taxPercentage=Double.parseDouble(inp.nextLine());
		
		
	}
	
	//setters and getters
	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
	//override toString
	public String toString() {
		return "Client ID: " + clientID+
				"\nAddress: " + address+
				"\nTax Percentage: " + taxPercentage+
				"\nTotal Bill: " + totalBill + "\n";
	}
	
	//checking id if its equal.
	public boolean findClientID(int clientID) {
		
		return this.clientID==clientID;
		
	}
	
	public abstract void findTax();
	
}
