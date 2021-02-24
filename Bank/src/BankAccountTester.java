import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter starting balance for this account: ");
		double startBal = in.nextDouble();
		//double Balance = startBal;
		BankAccount myBankAccount = new BankAccount(startBal);
		
		
			System.out.println("How much would you like to withdraw?: ");
			double withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
			
			System.out.println("How much owuld you like to deposit?: ");
			double depositAmount = in.nextDouble();
			myBankAccount.deposit(depositAmount);
			
			System.out.println("Your current balance is: " + myBankAccount.getBalance());
			
	}}
			
	

	

