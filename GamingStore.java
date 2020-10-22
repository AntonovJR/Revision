import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double balance = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        double totalMoney = balance;
        double totalSpend = 0;
        double price;

        while (!input.equals("Game Time")) {

            price = 0;

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance >= price && price > 0) {

                totalSpend += price;
                balance -= price;
                System.out.printf("Bought %s%n", input);

            } else if (balance < price && price > 0) {

                System.out.println("Too Expensive");
            }
            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }
            input = scan.nextLine();
        }
        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, (totalMoney - totalSpend));
        }
    }
}