public class CheckingsAccount extends BankAccount{

    //Instance Variables
    public String accountNum;
    public String createDate;
    public int balance;
    private String type;

    public CheckingsAccount(String AccountNum, String CreateDate, int Balance, String Type) {
        super(AccountNum, CreateDate);
        accountNum = AccountNum;
        createDate = CreateDate;
        balance = Balance;
        type = Type;
        super.SetCurrentNumber(super.GetCurrentNumber() + 1);
    }
}
