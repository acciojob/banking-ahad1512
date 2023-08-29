package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
    BankAccount b =new BankAccount("Ahad",20000,1000);
       String accNo = b.generateAccountNumber(6,20);
        System.out.println(accNo);
        b.deposit(100000);
        b.withdraw(15000);
       // b.withdraw(20000000);

        StudentAccount studentAccount = new StudentAccount("Aman",200.15,"IIT");
        System.out.println(studentAccount.getInstitutionName());

        SavingsAccount savingsAccount = new SavingsAccount("Shivam",40000,5000,7.2);
        //savingsAccount.withdraw(7000);
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount.getSimpleInterest(5));
        System.out.println(savingsAccount.getCompoundInterest(2,3));

        CurrentAccount currentAccount = new CurrentAccount("Sam",200000,"AABBCC");
       currentAccount.validateLicenseId();
    }
}