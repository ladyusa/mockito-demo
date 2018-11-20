package csku.mockitodemo.atm;

import org.junit.jupiter.api.BeforeEach;

public class BankTest {

	Bank bank;
	FakeCustomer cust;

	@BeforeEach
	public void setup() {
		bank = new Bank("MyBank");
		cust = new FakeCustomer(1, 123, "Kwan");
		bank.addCustomer(cust);
	}


	class FakeCustomer extends Customer {

        public FakeCustomer(int id, int pin, String name) {
            super(id, pin, name);
        }

        // override complicated / slow method
        public void complexMethod() {
            // complex code
        }
    }
}
