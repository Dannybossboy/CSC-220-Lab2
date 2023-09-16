import java.util.Scanner;

public abstract class BankAccount {
    //Class Variables
    public static final String bankName = "Well Fargo Bank";
    private static int currentNumber = 0;

    //Instance Variables
    public String accountNum;
    public String createDate;
    public int balance;
    private String type;

    

    public BankAccount() {
        this.accountNum = Integer.toString(currentNumber);
        currentNumber+=1;
        this.createDate = new java.util.Date().toString();
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
    //Static Getters
    public String GetBankName() {
        return bankName;
    }
    public int GetCurrentNumber() {
        return currentNumber;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your Bank Account");
        System.out.println("Type 1 to Create a Savings Account");
        System.out.println("Type 2 to Create a Checking Account");
        int i = sc.nextInt();
        switch (i) {
            case 1:
            System.out.println("What should your starting balance be?");
            i = sc.nextInt();
            SavingsAccount savings = new SavingsAccount(i);
            break;
            case 2:
            System.out.println("What should your starting balance be?");
            i = sc.nextInt();
            CheckingsAccount checkings = new CheckingsAccount(i);
            break;
        
            default:

            break;
        }
    }

}
