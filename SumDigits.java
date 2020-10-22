import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String number = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i <number.length() ; i++) {
            sum += num%10;
            num /=10;
        }
        System.out.println(sum);
    }
}
