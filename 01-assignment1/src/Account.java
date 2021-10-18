import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new java.util.Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.util.Date();
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterest() {
        return annualInterestRate/12;
    }

    public double withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Balance amount exceeded");
        } else {
            this.balance -= amount;
        }
        return this.balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public void printAccount() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("* ID: \t\t" + this.id + "\t\t*");
        System.out.println("* Balance: \t$" + this.balance+ "\t*");
        System.out.println("* Annual Interest Rate: " + this.annualInterestRate+ "%\t*");
        System.out.println("*********************************");
        System.out.println();
    
    }

}
