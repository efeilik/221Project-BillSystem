import java.util.ArrayList;
import java.util.Scanner;

public class ClientSystem {

	private static ArrayList<Client> arr= new ArrayList<>();
	private static final String USERNAME="admin", PASSWORD="admin";
	
	public static boolean checkLogin(String username, String password) {
		//check if login succesful
		return username.equalsIgnoreCase(USERNAME) && password.equalsIgnoreCase(PASSWORD);
		
	}
	
	public static boolean addClient(Client inp) {
		
		boolean isFound=false;
		int i=0;
		while(!isFound && i<=arr.size() && !arr.isEmpty()){	
			//using find clientID method for each client object in array list
			if(arr.get(i).findClientID(inp.getClientID()) ) {
				//if client id is found set boolean true to continue to get id and check id
				return false;
				}
			i++;
		}
		
		arr.add(inp);
		return true;
		
	}
	
	public static void addClient() {

		//declaring temp clients
		Personal tempPerson;
		Agriculture tempAgri;
		Industry tempInd;
		String ans;

		int clientID;
		boolean isFound=true;
		Scanner inp=new Scanner(System.in);
		//asking user for client id to check if it exists in array list
		System.out.println("Enter ID: ");
		clientID=inp.nextInt();

		//do it until user enters correct client id
		while(isFound){	
			isFound=false;
			for(int i=0; i < arr.size();i++) { 
				//using find clientID method for each client object in array list
				if(arr.get(i).findClientID(clientID)) {
					//if client id is found set boolean true to continue to get id and check id
					isFound=true;
					System.out.println("This client ID exists in the system. Enter again: ");
					clientID=inp.nextInt();
					
				}
				if(isFound)
					break;
			}

			

		}

		System.out.println("Which type of client (Personal/Business): ");
		ans=inp.nextLine();

		//if user wants to add personal type client
		if(ans.equalsIgnoreCase("Personal")) {
			//creating a personal client to add array list
			tempPerson=new Personal();
			
			tempPerson.setClientID(clientID);
			tempPerson.getInput();
			arr.add(tempPerson);
		}
		else if(ans.equalsIgnoreCase("Business")){
			System.out.println("Which type of business (Agriculture/Industry): ");
			ans=inp.nextLine();

			if(ans.equalsIgnoreCase("Agriculture")) {
				//creating agricultural type of business client
				tempAgri= new Agriculture();
				
				tempAgri.setClientID(clientID);
				tempAgri.getInput();
				arr.add(tempAgri);
			}

			else if(ans.equalsIgnoreCase("Industry")){
				//creating Industrial type of business client
				tempInd= new Industry();
				
				tempInd.setClientID(clientID);
				tempInd.getInput();
				arr.add(tempInd);
			}
		}

	}

	public static void deleteClient() {

		int clientID;
		boolean isDeleted=false;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter client ID you want to delete: ");
		clientID=inp.nextInt();

		//do it until it has deleted
		while(!isDeleted) {
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i).findClientID(clientID)) {
					arr.remove(i);
					isDeleted=true;
				}
			}
			System.out.println("\nYou entered client ID wrong. Please enter it again.");
			clientID=inp.nextInt();
		}

	}

	//returns all the clients in String
	public static String displayClient() {

		//initializing a string element
		String clients= "";
		for(int i=0; i<arr.size(); i++) {
			clients+= arr.get(i).toString() + "\n";
		}

		return clients;
	}


	public static Client searchClient(int clientID) {
		Client temp=null;

		for(int i=0; i<arr.size(); i++) {
			//checking if arr i. client has the equal clientID
			if(arr.get(i).findClientID(clientID))
				temp=arr.get(i);
		}
		return temp;
	}

	public static void calculateBill() {
		double totalBill;
		for(int i=0; i<arr.size(); i++) {
			totalBill=arr.get(i).EBill.getBillPrice()+arr.get(i).WBill.getBillPrice()+arr.get(i).GBill.getBillPrice();
			arr.get(i).setTotalBill(totalBill*arr.get(i).taxPercentage+totalBill);
			
		}
	}

}
