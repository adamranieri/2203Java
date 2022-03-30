package inheritance;

// Inheritance is a way to AVOID repeating our code DRY (Don't Repeat Yourself)
// Inheritance creates an is-a relationship, does help model the real world

public class InheritancePlayground {

    public static void main(String[] args) {

        CreditCard c = new CreditCard(0,1000,"Adam Ranieri");
        c.makePurchase(200);
        c.payOff(50);
        c.showBalance();

        CreditCard tc = new TravelCard(200,1000,"Mike Stevens");
        tc.makePurchase(500);
        tc.showBalance();
       // tc.showRewardPoints();

        // ReferenceType varaibleName = new ActualObjectType()
        // the refernce type is a label. It determines how you can interact with the object. What methods are avaialbe
        // IT DOES NOT change the actual implementation of those methods. A TravelCard will ALWAYS give reward points
        // whether you call it a travelCard or a CreditCard

    }
}

class CreditCard{

    double balance;
    int creditLimit;
    String owner;

    public CreditCard(double balance, int creditLimit, String owner) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.owner = owner;
    }

    void makePurchase(double amount){
        if(amount+ this.balance < creditLimit){
            this.balance += amount;
        }else{
            System.out.println("Transaction declined");
        }
    }

    void payOff(double amount){
        this.balance -= amount;
    }

    void showBalance(){
        System.out.println("The balance is " + this.balance);
    }

}

// Java has classical inheritance where one class inherits the methods and properties of another class
// You can only inherit from one class at a time
// The very first thing a class has to do is BUILD the parent object
// The constructor must build the parent with its first line super()
// TravelCard is a child of CreditCard
class TravelCard extends CreditCard{

    int rewardPoints;

    public TravelCard(){
        super(0,0,"");// very first line of a constructor is super
    }

    public TravelCard(double balance, int creditLimit, String owner) {
        super(balance, creditLimit, owner);
    }

    void showRewardPoints(){
        System.out.println("Reward Points " + this.rewardPoints);
    }

    // Overriding is changing the implementation of an inherted method
    // This does not actually DO anything. It throws an error if you ARE NOT overrding something
    // way to prevnt typos and make it obvious that you are overrding
    @Override
    void makePurchase(double amount){
        if(this.balance + amount< this.creditLimit){
            this.balance += amount;
            this.rewardPoints += amount*0.01;
            System.out.println("Current balance " + this.balance + " Current Reward Points " + this.rewardPoints);
        }else{
            System.out.println("Transaction Declined");
        }
    }

}
