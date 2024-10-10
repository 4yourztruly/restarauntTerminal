import java.util.Scanner;

public class Menu {
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Earth what is your name?");
        String userName = scanner.nextLine();
        System.out.println("How much money do you want to add to " + userName);
        int userBalance = scanner.nextInt();
        Person person = new Person(userName,userBalance);


    }
}
