import java.util.Scanner;

public class SumChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String symbol = "";
        int sum = 0;
        for (int i = 0; i < n; i++) {
           symbol = scanner.nextLine();
                int asciiValue = symbol.charAt(0);
                sum = sum + asciiValue;

        }
        System.out.println("The sum equals: " + sum);
    }
}