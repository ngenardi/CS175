import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestProject {
	
	private float balance = 0.00f;
	static DecimalFormat moneyFormat = new DecimalFormat("##.00");
	
	InterestProject(float newBal) {
		balance=newBal;
	}
	
	void GetInterest (double interestPercent) {
		double interest = interestPercent * balance;
		balance += interest;
	}
	
	float GetBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float startBal, endBal;
		double interestRate;
		
		do {
			System.out.print("Input the starting balance: ");
			startBal = scan.nextFloat();
			scan.nextLine();
		} while(!scan.hasNextFloat());
		
		InterestProject BankAccount = new InterestProject(startBal); 
		
		do {
			System.out.print("Input the interest rate as a decimal: ");
			interestRate = scan.nextDouble();
			scan.nextLine();
		} while(!scan.hasNextDouble());
		
		do {
			System.out.print("Input the target balance: ");
			endBal = scan.nextFloat();
			scan.nextLine();
		} while(!scan.hasNextFloat());
		
		int time = 0;
		while(BankAccount.GetBalance()<endBal) {
			++time;
			BankAccount.GetInterest(interestRate);
		}
		System.out.println("It took " + time + " months to reach the target balance of $" + moneyFormat.format(endBal) + ". "
				+ "Your new balance is $" + moneyFormat.format(BankAccount.GetBalance()));	
	}

}
