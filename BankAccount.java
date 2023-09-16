import java.util.Scanner;

public abstract class BankAccount implements Comparable<BankAccount> {
    //Class Variables
    public static final String bankName = "Well Fargo Bank";
    private static int currentNumber = 0;

    //Instance Variables
    public String accountNum;
    public String createDate;
    public int balance;
    private String type;

    public BankAccount(String accountNum, String createDate) {
        this.accountNum = String.valueOf(this.getCurrentNumber());
        currentNumber++;
        this.createDate = new java.util.Date().toString();
    }
    public BankAccount(String accountNum, String createDate, int balance, String type) {
        this.accountNum = String.valueOf(this.getCurrentNumber());
        currentNumber++;
        this.createDate = new java.util.Date().toString();
        this.balance = balance;
        this.type = type;
    }

    //Getters----------------
    public String getAccountNum() {
        return accountNum;
    }
    public String getCreateDate() {
        return createDate;
    }
    public int getBalance() {
        return balance;
    }
    public String getType() {
        return type;
    }
    //Static Getters
    public String getBankName() {
        return bankName;
    }
    public int getCurrentNumber() {
        return currentNumber;
    }
    //Setters----------------
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCurrentNumber(int num) {
        currentNumber = num;
    }
    //Other Methods----------------------------------
    public int compareTo(BankAccount otherObject) {
        if(accountNum == otherObject.getAccountNum()) return 0;
        if(Integer.valueOf(accountNum) > Integer.valueOf(otherObject.getAccountNum())) return 1;
        return -1;
    }
    public void printAccount() {
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNum);
        System.out.println("Date Created: " + createDate);
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
            savings.printAccount();
            break;
            case 2:
            System.out.println("What should your starting balance be?");
            i = sc.nextInt();
            CheckingsAccount checkings = new CheckingsAccount(i);
            checkings.printAccount();
            break;
        
            default:

            break;
        }
    }

}
