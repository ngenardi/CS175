import java.util.Scanner;
import java.text.DecimalFormat;

public class BankProgram {

	private float balance = 0.00f;
	DecimalFormat moneyFormat = new DecimalFormat("##.00");
	
	void Deposit(double money){
		balance += money;
		System.out.println("You have deposited $"+ moneyFormat.format(money) + ".\nYour new balanse is: $" + moneyFormat.format(balance));
	}
	
	void Withdraw(double money) {
		balance -= money;
		System.out.println("You have withdrawn $"+ moneyFormat.format(money) + ".\nYour new balanse is: $" + moneyFormat.format(balance));
	}
	
	void ViewBalance() {
		System.out.println("Your balance is: $" + moneyFormat.format(balance));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define variables and objects
		Scanner scan = new Scanner(System.in);
		
		BankProgram Bob = new BankProgram();
		BankProgram Mike = new BankProgram();
		
		boolean validInput = false;
		boolean doneWithActions = false;
		String accountName = "";
		String action = "";
		String yesOrNo = "";
		double money = 0;
		
		// Account Selection
		while (!validInput) {
			System.out.println("Who is currently accessing the ATM?");
			accountName = scan.nextLine();
			if (accountName.toLowerCase().equals("bob") || accountName.toLowerCase().equals("mike")) {
				validInput = true;
			}
			else {
				System.out.println("Invalid input.");
			}
		}
		
		// Action Selection
		if (accountName.toLowerCase().equals("bob")) {
			System.out.println("Welcome Bob");
			while(!doneWithActions) {
				System.out.println("Would you like to deposit, withdraw, or view balance?");
				action = scan.next();
				
				if(action.toLowerCase().equals("deposit")) {
					System.out.println("How much money would you like to deposit?");
					money = scan.nextDouble();
					Bob.Deposit(money);
				}
				
				else if(action.toLowerCase().equals("withdraw")) {
					System.out.println("How much money would you like to withdraw?");
					money = scan.nextDouble();
					Bob.Withdraw(money);
				}
				
				else if (action.toLowerCase().equals("view balance")) {
					Bob.ViewBalance();
				}
				
				else {
					System.out.println("Invalid input.");
				}
				
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to perform another action?");
					yesOrNo = scan.next();
					if(yesOrNo.toLowerCase().equals("yes")) {
						validInput = true;
					}
					else if(yesOrNo.toLowerCase().equals("no")) {
						doneWithActions = true;
						validInput = true;
						System.out.println("Goodbye!");
					}
					else {
						System.out.println("Invalid input.");
					}
				}
					
			}
		}
		else if (accountName.toLowerCase().equals("mike")) {
			System.out.println("Welcome Mike");
			while(!doneWithActions) {
				System.out.println("Would you like to deposit, withdraw, or view balance?");
				action = scan.next();
				
				if(action.toLowerCase().equals("deposit")) {
					System.out.println("How much money would you like to deposit?");
					money = scan.nextDouble();
					Mike.Deposit(money);
				}
				
				else if(action.toLowerCase().equals("withdraw")) {
					System.out.println("How much money would you like to withdraw?");
					money = scan.nextDouble();
					Mike.Withdraw(money);
				}
				
				else if (action.toLowerCase().equals("view balance")) {
					Mike.ViewBalance();
				}
				
				else {
					System.out.println("Invalid input.");
				}
				
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to perform another action?");
					yesOrNo = scan.next();
					if(yesOrNo.toLowerCase().equals("yes")) {
						validInput = true;
					}
					else if(yesOrNo.toLowerCase().equals("no")) {
						doneWithActions = true;
						validInput = true;
						System.out.println("Goodbye!");
					}
					else {
						System.out.println("Invalid input.");
					}
				}	
			}
		}	
	}
}
