public class SavingsAccount extends BankAccount {
    //Instance Variables
    public String accountNum;
    public String createDate;
    public int balance;
    private String type;

    public SavingsAccount(int Balance) {
        accountNum = Integer.toString(super.GetCurrentNumber());
        createDate = new java.util.Date().toString();
        balance = Balance;
        type = "Savings";
    }

}
