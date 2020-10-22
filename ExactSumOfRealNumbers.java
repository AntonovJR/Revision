import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int counter = 0;
        BigDecimal sum = new BigDecimal("0");

        while (counter < n) {
            BigDecimal num = new BigDecimal(scan.nextLine());
            sum = sum.add(num);
            counter++;
        }

        System.out.println(sum);
    }
}