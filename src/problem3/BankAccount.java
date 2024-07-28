package problem3;

abstract class BankAccount {
    public String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance){
        this.balance=balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
public SavingsAccount (String accountNumber, double balance){
    super (accountNumber,balance);
}

public void deposit(double amount){
    setBalance(getBalance()+amount);
    System.out.println("Deposit of$"+amount+"successful.Current balance:$"+getBalance());
}

public void withdraw(double amount) {
    if (getBalance() >= amount) {
        setBalance(getBalance() - amount);
        System.out.println("Withdrawl of $:" + amount + "successful.Current balance:$" + getBalance());
    } else{
            System.out.println("Insufficient funds.Withdrawal failed");
        }
    }
}
    class CurrentAccount extends BankAccount{
        public CurrentAccount (String accountNumber, double balance){
            super (accountNumber,balance);
        }

        public void deposit(double amount){
            setBalance(getBalance()+amount);
            System.out.println("Deposit of$" + amount
                    + "successful.Current balance:$"+getBalance());
        }

        public void withdraw(double amount) {
            if (getBalance() >= amount) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawl of $:" + amount + "successful.Current balance:$" + getBalance());
            }else{
                    System.out.println("Insufficient funds.Withdrawal failed");
                }
            }
        }

