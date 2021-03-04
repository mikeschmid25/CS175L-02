

	/**
	   A bank account has a balance and a mechanism for
	   applying interest or fees at the end of the month.
	*/
	public class BankAccount
	{
		// public double interestPct;
		
	   private double balance;
	   
	   /**
	      Constructs a bank account with zero balance.
	   */
	   public BankAccount(double amount) //double interestAmount)
	   {
	      balance = amount;
	      //interestPct = interestAmount;
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   public void deposit(double amount)
	   {
	      balance = balance + amount;
	   }

	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw(double amount)
	   {
	      balance = balance - amount;
	    
	    // if (balance < 0) {
	    	  //System.out.print("Insufficient Funds to support withdrawal");
	      } 

	     //else {
	    	 //System.out.print(balance);
	     //}
	   //}
	   /**
	      Gets the current balance of this bank account.
	      @return the current balance
	   */
	   
	   //public void calcInterest(double calculatedInterest) {
		  // double InterestAmount = interestPct * balance;
		  
		   
	   //}
	   //public double getInterest() {
		  // return interestPct * balance;
	   //}
	   
	   public double getBalance()
	   {
	      return balance;
	   }
	   //public double getBalancePlusInterest() {
		  // return balance + (interestPct * balance);
	   }
	   
	//}


