package org.example;

public class OppsExample {
    public static void main(String[] args) {
//        BankAccount account1 = new BankAccount("123", 200);
//        account1.deposit(20);
//        account1.withdraw(44);
//        System.out.println(account1.getBalance());

        BankAccount account2 = new SavingsAccount("123", 100);
        account2.deposit(200);
        account2.withdraw(50);
        System.out.println(account2.getBalance());
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

     double getBalance(){
        return this.balance;
    }
}

class SavingsAccount extends BankAccount{

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if(getBalance() - amount < 100){
            System.out.println("Minimum balance of $100 needs to be maintained");
        }else {
            super.withdraw(amount);
        }
    }
}
