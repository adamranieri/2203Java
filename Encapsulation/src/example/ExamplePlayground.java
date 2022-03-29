package example;

public class ExamplePlayground {

    public static void main(String[] args) {
        CreditCard c1 = new CreditCard(0,1000);
        c1.makePurchase(200);
        c1.makePurchase(700);
        c1.makePurchase(400);
        c1.payOff(600);
        c1.showBalanceAndLimit();

        // What prevents another programmer who has no idea how this class works from direclty
        // editing the values in a credit card???
        c1.showBalanceAndLimit();

        Person p = new Person();
        p.setAge(20);
        p.setFirstName("Bill");
        p.setLastName("Stevens");
        System.out.println(p.getAge());
        p.setAge(-90);
        System.out.println(p.getAge());
        String s = "something";
       
    }

}
