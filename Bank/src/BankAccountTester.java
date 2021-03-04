import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter starting balance for this account: ");
		double startBal = in.nextDouble();
		//System.out.println("Enter the interest rate for this account: ");
		//double interestRate = in.nextDouble();
				//double Balance = startBal;
		BankAccount myBankAccount = new BankAccount(startBal); //interestRate);
		
			System.out.println("How much would you like to deposit?: ");
			double depositAmount = in.nextDouble();
			myBankAccount.deposit(depositAmount);
			
			System.out.println("How much would you like to withdraw?: ");
			double withDrawAmount = in.nextDouble();
			myBankAccount.withdraw(withDrawAmount);
			
			//System.out.println("If you want me to calculate interest, enter 'Yes': ");
			//String answer = in.next();
				//if (answer.equals("Yes")) {
					//System.out.print(myBankAccount.getInterest());
				//}
			
			//System.out.print(calcInterest);
			
			System.out.print("The account balance is: " + myBankAccount.getBalance());//+ myBankAccount.getBalancePlusInterest());
			
	}}
			
	

	

