import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String population = scanner.nextLine();
        String squareKilometers = scanner.nextLine();
        System.out.printf("Town %s has population of %s and area %s square km.",name,population,squareKilometers);
    }
}
