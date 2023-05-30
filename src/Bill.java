import java.util.Scanner;

public abstract class Bill {

	protected String beginDate;
	protected String endDate;
	protected int billID;
	protected double billPrice;
	protected String billDueDate;
	
	
	public Bill() {}
	
	public Bill(String beginDate, String endDate, int billID, String billDueDate) {
		
		this.beginDate=beginDate;
		this.endDate=endDate;
		this.billID=billID;
		this.billDueDate=billDueDate;
	}

	public void getInput() {
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter begin date(dd/mm/yyyy): ");
		beginDate=inp.nextLine();
		
		System.out.println("Enter end date(dd/mm/yyyy): ");
		endDate=inp.nextLine();
		
		System.out.println("Enter bill due date: ");		
		
	}
	
	//getters and setters
	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public double getBillPrice() {
		return billPrice;
	}

	public void setBillPrice(double billPrice) {
		this.billPrice = billPrice;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public String getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(String billDueDate) {
		this.billDueDate = billDueDate;
	}
	
	public String toString() {
		return "Begin Date: " + beginDate +
				"\nEnd Date: " + endDate +
				"\nBill ID: " + billID +
				"\nBill Price: " + billPrice +
				"\nBill Due Date: " + billDueDate + "\n";
	}
	
	public abstract void calculatePrice();
	
}
