package example;

public class CreditCard {

    private int balance;// protected from errant code elsewhere in the program
    public final int creditLimit;

    public CreditCard(int paramBalance, int paramCreditLimit){
        this.balance = paramBalance;
        this.creditLimit = paramCreditLimit;
    }

    public void makePurchase(int amount){

        if(amount + this.balance < this.creditLimit){
            balance += amount;
            System.out.println("The new balance is " + this.balance);
        }else{
            System.out.println("That was too expensive purchase not made");
        }
    }

    public void payOff(int amount){
        this.balance -= amount;
        System.out.println("Current balance is " + this.balance);
    }

    public void showBalanceAndLimit(){
        System.out.println("The Balance is " + this.balance);
        System.out.println("The Credit Limit is " + this.creditLimit);
    }

}
