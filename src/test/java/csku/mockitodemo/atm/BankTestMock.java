package csku.mockitodemo.atm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class BankTestMock {

    @Mock private Customer mockCustomer;

    // CUT
    private Bank bank;

    @BeforeEach
    void initMocks() {
        MockitoAnnotations.initMocks(this);
        bank = new Bank("KU Bank");
    }

    @Test
    void testValidateCustomer() {
        int id = 1;
        int pin = 111;

        when(mockCustomer.getId()).thenReturn(id);

        bank.addCustomer(mockCustomer);
        bank.validateCustomer(id, pin);

        verify(mockCustomer).match(pin);
    }
}
