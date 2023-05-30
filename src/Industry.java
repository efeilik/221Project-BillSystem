import java.util.Scanner;

public class Industry extends Business{

	private int workerNb;
	
	public Industry() {}
	
	public Industry(int clientID, String address, String firmName, int foundationYear, int workerNb) {
		super(clientID,address,firmName,foundationYear);
		this.workerNb=workerNb;
		
	}

	public void getInput() {
		
		super.getInput();
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("\nEnter Acre Size: ");
		workerNb=Integer.parseInt(inp.nextLine());
		
	}
	
	//getter and setter
	public int getWorkerNb() {
		return workerNb;
	}

	public void setWorkerNb(int workerNb) {
		this.workerNb = workerNb;
	}
	
	public String toString() {
		return super.toString() + "\nWorker Number: " + workerNb + "\n";
	}
	
	public void findTax(){
		
		if(workerNb<100)
			this.setTaxPercentage(0.25);
		else if(workerNb<1000)
			this.setTaxPercentage(0.32);
		else if(workerNb<10000)
			this.setTaxPercentage(0.35);
		else
			this.setTaxPercentage(0.38);
		
	}
	
	
	
	
}
