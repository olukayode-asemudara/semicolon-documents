import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class AccountTest{

	Account myAccount;

	@BeforeEach
	void setUp(){
		myAccount = new Account();
	}

	@Test
	public void testThatIHaveAccountICheckBalanceAndBalanceIsZero(){
			
		
		assertNotNull(myAccount);

//Creating a new object  of class Account - I am saying I have an account
//The class Account has not been created yet
//This test should fail

//Class is a blueprint(Architectural Drawing)
//Object can be the houses that come out of that drawing

		int expectedBalance = 0;
		int actualBalance = myAccount.checkBalance();
		assertEquals(actualBalance, expectedBalance);
		
	}


	@Test
	public void testThatIDeposit2kBalanceIs2k(){

		int expectedBalance = 0;
		int actualBalance = myAccount.checkBalance();

		assertEquals(expectedBalance, actualBalance);

		int amountToDeposit = 2000;
		myAccount.deposit(amountToDeposit);

		int newExpectedBalance = 2000;
		int newActualBalance = myAccount.checkBalance();

		assertEquals(newExpectedBalance, newActualBalance);

		myAccount.deposit(5000);

		int newestExpectedBalance = 7000;
		int newestActualBalance = myAccount.checkBalance();

		assertEquals(newestExpectedBalance, newestActualBalance);
	
	}

	@Test
	public void testThatIDepositNegativeAmountExceptionIsThrown(){

		myAccount.deposit(5000);

		assertThrows(IllegalArgumentException.class, ()-> myAccount.deposit(-2000) );

		assertEquals(5000, myAccount.checkBalance());
		

	}

	@Test
	public void testThatIDeposit5kWithdrew2kBalanceIs3k(){

		myAccount.deposit(5000);
		
		myAccount.withdraw(2000);
		
		assertEquals(3000, myAccount.checkBalance());	

	}

	@Test
	public void testThatIDeposit5kWithdraw15kExceptionIsThrownBalanceIs5k(){

		myAccount.deposit(5000);
		

		assertThrows(IllegalArgumentException.class, ()-> myAccount.withdraw(15000) );

		assertEquals(5000, myAccount.checkBalance());

	}

	@Test
	public void testThatIDeposit5kWithdrawNegativeAmountExceptionIsThrownBalanceIs5k(){

		myAccount.deposit(5000);

		assertThrows(IllegalArgumentException.class, ()-> myAccount.withdraw(-2000) );

		assertEquals(5000, myAccount.checkBalance());

	}

	@Test
	public void testThatIDeposit10kTransfer3kMyBalanceIs7kTheirBalanceIs3k(){
		Account theirAccount = new Account();

		myAccount.deposit(10000);
		myAccount.transfer(3000, theirAccount);

		assertEquals(7000, myAccount.checkBalance() );	
		assertEquals(3000, theirAccount.checkBalance() );		

	}




	














}