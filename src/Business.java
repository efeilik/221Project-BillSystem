import java.util.Scanner;

public abstract class Business extends Client{

	protected String firmName;
	protected int foundationYear;
	
	public Business() {};
	
	public Business(int clientID, String address, String firmName, int foundationYear) {
		super(clientID,address);
		
		this.firmName=firmName;
		this.foundationYear=foundationYear;
		
	}

	public void getInput() {
		
		super.getInput();
		Scanner inp=new Scanner(System.in);
		
		System.out.println("\nEnter Firm Name: ");
		firmName=inp.nextLine();
		
		System.out.println("Enter foundation year: ");
		foundationYear=Integer.parseInt(inp.nextLine());
		
	}
	
	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public int getFoundationYear() {
		return foundationYear;
	}

	public void setFoundationYear(int foundationYear) {
		this.foundationYear = foundationYear;
	}
	
	public String toString() {
		
		return super.toString() + "Firm Name: " + firmName + 
				"\nFoundation Year: " + foundationYear;
		
	}
	
	
}
