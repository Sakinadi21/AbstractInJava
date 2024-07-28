
package problem3;

public class Main{
            public static void main(String[] args) {
                double ibal,damt,wamt;
                ibal=10000.00;
                SavingsAccount savingsAccount = new SavingsAccount("SA001",ibal);
                System.out.println("Savings A/c: Initial Balance:$"+ibal);
                damt=500.00;
                savingsAccount.deposit(damt);
                wamt=250.00;
                savingsAccount.withdraw(wamt);
                wamt=1600.00;
                System.out.println("\nTry to withdraw:$"+wamt);
                savingsAccount.withdraw(wamt);
                System.out.println();
                ibal=5000;
                CurrentAccount currentAccount = new CurrentAccount("Ca001",ibal);
                System.out.println("Current A/c: Initial Balance:$"+ibal);
                damt=2500.00;
                currentAccount.deposit(damt);
                wamt=1250.00;
                currentAccount.withdraw(wamt);
                wamt=6000.00;
                System.out.println("\nTry to withdraw:$"+wamt);
                savingsAccount.withdraw(wamt);
            }
        }
