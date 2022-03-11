package csku.mockitodemo.bank;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class BankTestMock {

    @Test
    void testTransfer() {
        // create mock objects
        BankAccount mockAccountA = mock(BankAccount.class);
        BankAccount mockAccountB = mock(BankAccount.class);
        when(mockAccountA.getName()).thenReturn("A");
        when(mockAccountB.getName()).thenReturn("B");

        // create CUT and setting up
        Bank bank = new Bank("Test Bank");
        bank.addAccount(mockAccountA);
        bank.addAccount(mockAccountB);

        // call method under test
        bank.transfer("A", "B", 1000);

        // ตรวจสอบที่ mock object
        verify(mockAccountA).withdraw(1000);
        verify(mockAccountB).deposit(1000);
    }
}
