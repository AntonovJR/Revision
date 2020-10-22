import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String input = scanner.nextLine();
        int counter =0;
        String password = new StringBuffer(username).reverse().toString();
        while(!input.equals(password)){
            if(counter==3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
            counter++;

        }if(input.equals(password)){
            System.out.printf("User %s logged in.", username);
        }

    }
}
