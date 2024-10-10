public class Person {
    private String name;
    private int balance;

    public void eat(Food food) {
        System.out.println("I ate the " + food);
    }

    public void pay(int price) {
       if(price > balance) {
           System.out.println("can't afford that");
       }

       balance += price;
       System.out.println("I payed " + price + " and i have " + balance + " left");
    }

    public Person(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
}
