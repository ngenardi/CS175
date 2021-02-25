import java.util.Scanner;
import java.text.DecimalFormat;

public class BankProgram {

	private float balance = 0.00f;
	DecimalFormat moneyFormat = new DecimalFormat("##.00");
	
	public BankProgram(float startBal){
		balance = startBal;
	}
	void Deposit(double money){
		balance += money;
		System.out.println("You have deposited $"+ moneyFormat.format(money) + ".\nYour new balance is: $" + moneyFormat.format(balance));
	}
	
	void Withdraw(double money) {
		if (money <= balance) {
			balance -= money;
			System.out.println("You have withdrawn $"+ moneyFormat.format(money) + ".\nYour new balance is: $" + moneyFormat.format(balance));
		}
		else {
			System.out.println("Insufficient funds. Your balance is: $" + moneyFormat.format(balance));
		}
	}
	
	void GetInterest (double interestPercent) {
		double interest = interestPercent * balance;
		balance += interest;
		System.out.println("You have gained $" + moneyFormat.format(interest) + ".\nYour new balance is: $" + moneyFormat.format(balance));
	}
	
	void ViewBalance() {
		System.out.println("Your balance is: $" + moneyFormat.format(balance));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define variables and objects
		Scanner scan = new Scanner(System.in);
		
		BankProgram Bob = new BankProgram(1000.00f);
		BankProgram Mike = new BankProgram(500.00f);
		
		boolean validInput = false;
		boolean doneWithActions = false;
		String accountName = "";
		String action = "";
		String yesOrNo = "";
		double money = 0;
		double interestPercent = 0;
		
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
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to deposit, withdraw, get interest, or view balance?");
					action = scan.nextLine();
					
					if(action.toLowerCase().equals("deposit")) {
						System.out.println("How much money would you like to deposit?");
						money = scan.nextDouble();
						scan.nextLine();
						Bob.Deposit(money);
						validInput = true;
					}
					
					else if(action.toLowerCase().equals("withdraw")) {
						System.out.println("How much money would you like to withdraw?");
						money = scan.nextDouble();
						scan.nextLine();
						Bob.Withdraw(money);
						validInput = true;
					}
					else if (action.toLowerCase().equals("get interest")) {
						System.out.println("What is the interest rate?");
						interestPercent = scan.nextDouble();
						scan.nextLine();
						Bob.GetInterest(interestPercent);
						validInput = true;
					}
					
					else if (action.toLowerCase().equals("view balance")) {
						Bob.ViewBalance();
						validInput = true;
					}
					
					else {
						System.out.println("Invalid input.");
					}
				}
				
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to perform another action?");
					yesOrNo = scan.nextLine();
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
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to deposit, withdraw, get interest, or view balance?");
					action = scan.nextLine();
					
					if(action.toLowerCase().equals("deposit")) {
						System.out.println("How much money would you like to deposit?");
						money = scan.nextDouble();
						scan.nextLine();
						Mike.Deposit(money);
						validInput = true;
					}
					
					else if(action.toLowerCase().equals("withdraw")) {
						System.out.println("How much money would you like to withdraw?");
						money = scan.nextDouble();
						scan.nextLine();
						Mike.Withdraw(money);
						validInput = true;
					}
					else if (action.toLowerCase().equals("get interest")) {
						System.out.println("What is the interest rate?");
						interestPercent = scan.nextDouble();
						scan.nextLine();
						Mike.GetInterest(interestPercent);
						validInput = true;
					}
					
					else if (action.toLowerCase().equals("view balance")) {
						Mike.ViewBalance();
						validInput = true;
					}
					
					else {
						System.out.println("Invalid input.");
					}
				}
				
				validInput = false;
				while(!validInput) {
					System.out.println("Would you like to perform another action?");
					yesOrNo = scan.nextLine();
					if(yesOrNo.toLowerCase().equals("yes")) {
						validInput = true;
					}
					else if(yesOrNo.toLowerCase().equals("no")) {
						doneWithActions = true;
						validInput = true;
						System.out.println("Goodbye!");
					}
					else {
						System.out.println("Invalid  input." );
					 }
				}	 
			}
		 }	
	} 
}