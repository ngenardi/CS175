import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {
	
	private float balance = 0.00f;
	static DecimalFormat moneyFormat = new DecimalFormat("##.00");
	
	public Interest(float startBal){
		balance = startBal;
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
		
		System.out.print("Input the starting balance: ");
		float startBal = scan.nextFloat();
		scan.nextLine();
		Interest BankAccount = new Interest(startBal);
		
		System.out.print("Input the interest rate as a decimal: ");
		double interestRate = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("Input the target balance: ");
		float endBal = scan.nextFloat();
		scan.nextLine();
		
		int time = 0;
		while(BankAccount.GetBalance()<endBal) {
			++time;
			BankAccount.GetInterest(interestRate);
		}
		System.out.println("It took " + time + " months to reach the target balance of $" + moneyFormat.format(endBal) + ". "
				+ "Your new balance is $" + moneyFormat.format(BankAccount.GetBalance()));	
	}

}
