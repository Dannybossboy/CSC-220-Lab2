public class BankAccountTester {
       /* File: BankAccountTester.java
 * By: Daniel Smirnoff
 * Date: 9/15/2023
 * Compile:
 * Usage: Run Main to check tests
 * System: I think every system
 * Description: Bank Account Driver
 */

    static MyArrayBagInterface<BankAccount> bank = new MyArrayBag<BankAccount>();

    public static void main(String[] args) {
        bank.add(new CheckingsAccount(500));
        
        bank.add(new CheckingsAccount(250));
        bank.add(new SavingsAccount(1200));
        bank.add(new SavingsAccount(5000));
        
        BankAccount[] bankArray = bank.toArray(); //Has array error but adds correctly
        for (int i = 0; i < bankArray.length; i++) {
            if(bankArray[i] == null) continue;
            bankArray[i].printAccount();
        }
        
    }
}
