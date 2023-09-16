public class BuildBag {
       /* File: BuildBag.java
 * By: Daniel Smirnoff
 * Date: 9/15/2023
 * Compile:
 * Usage: Run Main to check class
 * System: I think every system
 * Description: Basic linkedbagtest Class
 */

    static MyArrayBagInterface<BankAccount> bank = new MyLinkedBag<BankAccount>();
    static SavingsAccount savingsAccount = new SavingsAccount(825);
    public static void main(String[] args) {
        bank.add(new SavingsAccount(500));
        bank.add(savingsAccount);
        bank.add(new CheckingsAccount(800));
        bank.add(new CheckingsAccount(1200));

        System.out.println(bank.contains(savingsAccount)); //Should return true

        bank.remove(savingsAccount);

        System.out.println(bank.contains(savingsAccount)); //Should return false

    }
}
