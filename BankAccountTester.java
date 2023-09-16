public class BankAccountTester {

    static MyArrayBagInterface<BankAccount> bank = new MyArrayBag<BankAccount>();

    public static void main(String[] args) {
        bank.add(new CheckingsAccount(500));
        bank.add(new CheckingsAccount(250));
        bank.add(new SavingsAccount(1200));
        bank.add(new SavingsAccount(5000));
        
        BankAccount[] bankArray = bank.toArray();
        for (int i = 0; i < bankArray.length; i++) {
            if(bankArray[i] == null) continue;
            bankArray[i].printAccount();
        }
        
    }
}
