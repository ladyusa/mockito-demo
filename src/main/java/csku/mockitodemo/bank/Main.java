package csku.mockitodemo.bank;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("KU Bank");
        BankAccount johnAct = new BankAccount("John", 1000);
        BankAccount annAct = new BankAccount("Ann", 500);
        bank.addAccount(johnAct);
        bank.addAccount(annAct);

        bank.transfer("John", "Ann", 200);

        System.out.println(johnAct);
        System.out.println(annAct);
    }
}
