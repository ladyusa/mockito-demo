package csku.mockitodemo.hr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HumanResourceServiceTestMock {

    @Test
    void testValidateCustomer() {
        // create mock objects
        Employee mockEmployee1 = mock(Employee.class);
        Employee mockEmployee2 = mock(Employee.class);

        // create CUT and setting up
        HumanResourceService hr = new HumanResourceService();
        hr.addEmployee(mockEmployee1);
        hr.addEmployee(mockEmployee2);

        // call method under test
        hr.raiseSalaryAll(0.1);

        // ตรวจสอบที่ mock object
        verify(mockEmployee1).raiseSalary(0.1);
        verify(mockEmployee2).raiseSalary(0.1);
    }
}
