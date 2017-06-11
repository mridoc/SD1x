package week2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    BankAccount bankAccount; //used throughout this test

    @Before
    public void setUp() throws Exception {
        bankAccount = new BankAccount();
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(100);
        assertEquals(bankAccount.balance, 100, 0.0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
        bankAccount.deposit(10);
        assertEquals(bankAccount.balance, 910, 0.0);
    }

}
