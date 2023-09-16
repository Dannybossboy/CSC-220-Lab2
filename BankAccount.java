public abstract class BankAccount {
    //Instance Variables
    public String accountNum;
    public String createDate;
    public int balance;
    private String type;

    //Class Variables
    public static String bankName;
    private static int currentNumber = 0;

    public BankAccount(String accountNum, String createDate) {
        this.accountNum = accountNum;
        this.createDate = createDate;
    }
    public BankAccount(String accountNum, String createDate, int balance, String type) {
        this.accountNum = accountNum;
        this.createDate = createDate;
        this.balance = balance;
        this.type = type;
    }

    //Getters----------------
    public String GetAccountNum() {
        return accountNum;
    }
    public String GetCreateDate() {
        return createDate;
    }
    public int GetBalance() {
        return balance;
    }
    public String GetType() {
        return type;
    }
    //Setters----------------
    public void SetAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public void SetCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public void SetBalance(int balance) {
        this.balance = balance;
    }
    public void SetType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your Bank Account");

    }

}
