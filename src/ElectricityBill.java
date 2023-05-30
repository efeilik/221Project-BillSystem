import java.util.Scanner;

public class ElectricityBill extends Bill{

	private double dayUsedKWH;
	private double nightUsedKWH;
	private final double DAYUNITPRICE = 2;
	private final double NIGHTUNITPRICE = 1;
	
	public ElectricityBill() {}
	
	public ElectricityBill(String beginDate, String endDate, int billID, String billDueDate, double dayUsedKWH, double nightUsedKWH) {
		
		super(beginDate,endDate,billID,billDueDate);
		this.dayUsedKWH=dayUsedKWH;
		this.nightUsedKWH=nightUsedKWH;
		
	}

	public void getInput() {
		
		super.getInput();
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter used KWH in day time: ");
		dayUsedKWH=Double.parseDouble(inp.nextLine());
		
		System.out.println("Enter used KWH in night time: ");
		nightUsedKWH=Double.parseDouble(inp.nextLine());
		
		
	}
	//getters and setters
	public double getDayUsedKWH() {
		return dayUsedKWH;
	}

	public void setDayUsedKWH(double dayUsedKWH) {
		this.dayUsedKWH = dayUsedKWH;
	}

	public double getNightUsedKWH() {
		return nightUsedKWH;
	}

	public void setNightUsedKWH(double nightUsedKWH) {
		this.nightUsedKWH = nightUsedKWH;
	}
	
	public String toString() {
		return super.toString() + "Day Time Used KWH: " + dayUsedKWH+
				"\nNight Time Used KWH: " + nightUsedKWH;
	}
	
	public void calculatePrice() {
		super.setBillPrice(DAYUNITPRICE*dayUsedKWH+NIGHTUNITPRICE*nightUsedKWH);
		System.out.println("Price has calculated!");
	}
	
}
