/**
 * 
 */
package implement;
/****Write a Java program to create a class known as "BankAccount"
with methods called deposit() and withdraw(). Create a subclass
called SavingsAccount that overrides the withdraw() method to
prevent withdrawals if the account balance falls below one hundred.*****/

class BankAccount{
	int  oldBankBalance=1000;
	int BankBalance;
	int withdraw;
	
	void deposit(int deposit) {
		System.out.println("deposit amount :"+deposit);
	    BankBalance=deposit+oldBankBalance;
	   System.out.println("current balance:"+BankBalance);
	}
  void withdraw(int withdraw) {
	
	   int  balance=(BankBalance-withdraw);
	   System.out.println("Balance amount :"+balance);
	   
	   if(balance<=100) {
		  System.out.println("maintain your bankbalance");
	  }else {
		  System.out.println("*******Thanks for Visit*******");
	  }
	}	
}
class savingsAccount extends BankAccount {
	void withtdrawel() {
		System.out.println("    BANK ACCOUNT DETAILS:");
	}
}
public class bankdetail {
	public static void main(String[] args) {
		savingsAccount sa = new savingsAccount();
		sa.withtdrawel();
		sa.deposit(1000);
		sa.withdraw(1050);
		
	
	
  }
}
