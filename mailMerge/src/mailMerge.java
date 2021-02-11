import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define scanner, prompts/outputs, inputs, and booleans
		Scanner scan = new Scanner(System.in);
		boolean correctInfo = false, validResponse = false;
		String firstName, lastName, houseNum, streetName, response;
		String replaceText1 = "Dear <firstName> <lastName>,"; 
		String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		// Will loop data input until response says yes
		while(!correctInfo) {
			// Input data
			System.out.print(promptText1);
			firstName = scan.nextLine();
			
			System.out.print(promptText2);
			lastName = scan.nextLine();
			
			System.out.print(promptText3);
			houseNum = scan.nextLine();
			
			System.out.print(promptText4);
			streetName = scan.nextLine();
			
			// Ask if info is correct
			System.out.println(replaceText1.replace("<firstName>", firstName).replace("<lastName>", lastName));
			System.out.println(replaceText2.replace("<houseNumber>", houseNum).replace("<street>", streetName));
			
			// Will loop until response is "yes" or "no"
			validResponse = false;
			while(!validResponse) {
				System.out.print(promptText5);
				response = scan.nextLine();
				if (response.toLowerCase().equals("yes")) {
					validResponse = true;
					correctInfo = true;
					System.out.println(replaceText3.replace("<yORn>", response));
				}
				else if (response.toLowerCase().equals("no")){
					validResponse=true;
				}
				else {
					System.out.println("\"" + response + "\"" + " is not a valid response.");
				}
			}
		}
	}
}
