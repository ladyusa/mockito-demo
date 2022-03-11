package csku.mockitodemo.bank;

import csku.mockitodemo.hr.HumanResourceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class BankTestMockAnnotation {

    @Mock BankAccount mockAccountA;
    @Mock BankAccount mockAccountB;

    // CUT
    private Bank bank;

    @BeforeEach
    void initMocks() {
        MockitoAnnotations.openMocks(this);
        bank = new Bank("Test Bank");
    }

    @Test
    void testTransfer() {
        when(mockAccountA.getName()).thenReturn("A");
        when(mockAccountB.getName()).thenReturn("B");

        // setting up
        bank.addAccount(mockAccountA);
        bank.addAccount(mockAccountB);

        // call method under test
        bank.transfer("A", "B", 1000);

        // ตรวจสอบที่ mock object
        verify(mockAccountA).withdraw(1000);
        verify(mockAccountB).deposit(1000);
    }
}
