import java.util.Scanner;

public class demonstratingSavingsAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your current interest Rate");
		double interest = kb.nextDouble();
		
		System.out.println("What is your current balance");
		double balance = kb.nextDouble();
		
		System.out.println("How many months have passed since starting the account");
		int months = kb.nextInt();
		
		savingsAccount user = new savingsAccount(balance, interest);
		
		//loop asking for deposit and withdrawals made per month
		for(int i = 1; i <= months; i+=1) {
			System.out.println("In month " + i + " how much did you deposit");
			user.deposit(kb.nextDouble());
			
			System.out.println("In month " + i + " how much did you withdraw");
			user.withdraw(kb.nextDouble());
			
			user.monthlyInterestGain();
		}
		
		System.out.println("Total amount of balance: $" + user.showBalance());
		System.out.println("Total amount of deposits: $" + user.showDeposit());
		System.out.println("Total amount of withdrawals: $" + user.showWithDrawal());
		System.out.println("Total amount of interest: $" + user.showInterest());
		
		kb.close();
	}

}
