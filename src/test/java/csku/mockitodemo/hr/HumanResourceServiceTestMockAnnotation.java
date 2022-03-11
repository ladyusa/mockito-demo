package csku.mockitodemo.hr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class HumanResourceServiceTestMockAnnotation {

    @Mock private Employee mockEmployee1;
    @Mock private Employee mockEmployee2;

    // CUT
    private HumanResourceService hr;

    @BeforeEach
    void initMocks() {
        MockitoAnnotations.openMocks(this);
        hr = new HumanResourceService();
    }

    @Test
    void testValidateCustomer() {
        double rate = 0.1;

        hr.addEmployee(mockEmployee1);
        hr.addEmployee(mockEmployee2);

        hr.raiseSalaryAll(rate);

        verify(mockEmployee1).raiseSalary(rate);
        verify(mockEmployee2).raiseSalary(rate);
    }
}
