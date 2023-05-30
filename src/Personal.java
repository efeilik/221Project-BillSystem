import java.util.Scanner;

public class Personal extends Client{

	private String nameSurname;
	private String personType;
	
	public Personal() {}
	
	public Personal(int clientID, String address, String nameSurname, String personType) {
		super(clientID,address);
		this.nameSurname=nameSurname;
		this.personType=personType;
		
	}

	public void getInput() {
		
		super.getInput();
		Scanner inp=new Scanner(System.in);
		
		System.out.println("\nEnter Name Surname: ");
		nameSurname=inp.nextLine();
		
		System.out.println("Enter your person type (Student/Retired/Others): ");
		personType=inp.nextLine();
		
		
	}
	
	//getters and setters
	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}
	
	public String toString() {
		return super.toString() + "Name Surname: " + nameSurname+
				"\nPerson Type: " + personType + "\n"; 
	}
	
	public void findTax() {
		
		Scanner inp=new Scanner(System.in);
		
		if(personType.equalsIgnoreCase("student"))
			this.setTaxPercentage(0.15);
		else if(personType.equalsIgnoreCase("retired"))
			this.setTaxPercentage(0.17);
		else
			this.setTaxPercentage(0.20);
		
		
		
		
	}
	
}
