import java.util.Scanner;

public class Agriculture extends Business{

	private double acreSize;

	public Agriculture() {}
	
	public Agriculture(int clientID, String address, String firmName, int foundationYear, double acreSize) {
		
		super(clientID,address,firmName,foundationYear);
		this.acreSize=acreSize;
	}

	public void getInput() {
		
		super.getInput();
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("\nEnter Acre Size: ");
		acreSize=Double.parseDouble(inp.nextLine());
		
		
	}
	
	
	//getter and setter
	public double getAcreSize() {
		return acreSize;
	}

	public void setAcreSize(double acreSize) {
		this.acreSize = acreSize;
	}
	
	public String toString() {
		
		return super.toString() + "Acre Size: " + acreSize + "\n";
		
	}
	
	public void findTax() {
		if(acreSize<=10)
			this.setTaxPercentage(0.10);
		else if(acreSize<20)
			this.setTaxPercentage(0.12);
		else
			this.setTaxPercentage(0.18);
	}
	
}
