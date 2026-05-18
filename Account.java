public class Account{

	int balance;

	public int checkBalance(){

		return balance;
	}

	public void deposit(int amountToDeposit){
		if (amountToDeposit < 0) throw new IllegalArgumentException("Amount cannot be negative");

		balance += amountToDeposit;
	}

	public void withdraw(int amountToWithdraw ){

		if(amountToWithdraw < 0) throw new IllegalArgumentException("Amount cannot be negative");

		if(amountToWithdraw > balance) throw new IllegalArgumentException("Ole!!!!! You don't have this money");
	
		balance -= amountToWithdraw ;
	}


	public void transfer(int amountToTransfer, Account theirAccount){
		withdraw(amountToTransfer);
		theirAccount.deposit(amountToTransfer);
	}

	public void transfer(Account theirAccount,  int amountToTransfer){
		withdraw(amountToTransfer);
		theirAccount.deposit(amountToTransfer);
	}

}

