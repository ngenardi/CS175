import java.util.ArrayList;

public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Add 4 accounts
		BankAccount gil = new BankAccount("Gil",500);
		BankAccount joe = new BankAccount("Joe",1000);
		BankAccount fred = new BankAccount("Fred",2000);
		BankAccount sally = new BankAccount("Sally",2500);
		
		// create arrayList
		ArrayList<BankAccount> accountList = new ArrayList<>();
		
		// add first 3 accounts to arrayList
		accountList.add(gil);
		accountList.add(joe);
		accountList.add(fred);
		
		// print all accounts in arrayList
		for(BankAccount account : accountList) {
			System.out.println(account.getAccount());
		}
		
		// add Sally
		accountList.add(sally);
		
		// assign variables for highest balance and the position of the account with the highest balance as the first position (position 0)
		double highestBal = accountList.get(0).getBalance();
		int highestPosition = 0;
		
		// search for highest balance and balance position starting at the second position (position 1)
		for(int i=1; i < accountList.size(); i++) {
			if (highestBal < accountList.get(i).getBalance()) {
				highestBal = accountList.get(i).getBalance();
				highestPosition = i;
			}
		}
		
		// print highest balance account's
		System.out.println(accountList.get(highestPosition).getAccount());
		
		// remove sally
		accountList.remove(sally);
		
		// reassign highestBal and highestPosition as the first position values (position 0)
		highestBal = accountList.get(0).getBalance();
		highestPosition = 0;
		
		// search for highest balance and balance position starting at the second position (position 1)
		for(int i=1; i < accountList.size(); i++) {
			if (highestBal < accountList.get(i).getBalance()) {
				highestBal = accountList.get(i).getBalance();
				highestPosition = i;
			}
		}
		
		// print highest balance account's info
		System.out.println(accountList.get(highestPosition).getAccount());
	}

}
