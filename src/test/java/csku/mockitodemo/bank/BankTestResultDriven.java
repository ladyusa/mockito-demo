package csku.mockitodemo.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestResultDriven {

    @Test
    void testTransfer() {
        Bank bank = new Bank("KU Bank");
        BankAccount johnAct = new BankAccount("John", 1000);
        BankAccount annAct = new BankAccount("Ann", 2000);
        bank.addAccount(johnAct);
        bank.addAccount(annAct);

        bank.transfer("John", "Ann", 200);

        assertEquals(800, johnAct.getBalance());
        assertEquals(2200, annAct.getBalance());
    }
}
