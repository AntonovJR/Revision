import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            num = i;
            sum=0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%s -> True%n", i);
                } else {
                    System.out.printf("%s -> False%n", i);
            }

        }
    }
}