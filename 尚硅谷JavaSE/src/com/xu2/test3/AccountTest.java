package com.xu2.test3;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());
    }
}
