public class Playground {

    public static void main(String[] args) {
//        CreditCard c1 = new CreditCard(); // cannot make JUST a credit card anymore
//        c1.creditLimt = 1000;
//        c1.makePurchase(400);
//        System.out.println(c1);
//        String x = c1.toString();

        CreditCard c2 = new CashBackCard();
        c2.creditLimt = 1000;
        c2.makePurchase(400);
        System.out.println(c2);

    }
}

// Abstract makes the class unable to be directly created
// Abstract classes are a tool for designing OOP programs and relationships
// Abstract classes were in Java 1.
abstract  class CreditCard{

    double balance;
    double creditLimt;

    CreditCard(){
        this.balance = 0;
        this.creditLimt = 0;
    }

    // abstract methods exist only in abstract classes.
    // methods that lack an implementation
    // 100% optional in an abstract class
    // You can get away with this becasue a child class can will always override and provide an implementation
    abstract void makePurchase(double amount);

    @Override //
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", creditLimt=" + creditLimt +
                '}';
    }
}

class CashBackCard extends CreditCard{

    @Override
    void makePurchase(double amount){
        if(amount + this.balance < this.creditLimt){
            this.balance += amount;
            this.balance -= amount*0.01;// 1% cashback automatically applied
        }else{
            System.out.println("Transaction Declined");
        }
    }
}

class TravelCard extends  CreditCard{
    int miles;

    @Override
    void makePurchase(double amount){
        if(amount + this.balance < this.creditLimt){
            this.balance += amount;
            this.miles += amount*3; // 3 miles per dollar
        }else{
            System.out.println("Transaction Declined");
        }
    }

}

class DiamondCard extends CreditCard{

    @Override
    void makePurchase(double amount) {

    }
}