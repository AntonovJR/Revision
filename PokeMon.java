import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double percent = (double)power * 0.50;

        while (power >= distance) {
            counter++;
            power -= distance;
            if (power == percent && factor != 0) {
                power /= factor;
            }
        }
        System.out.println(power);
        System.out.println(counter);

    }
}