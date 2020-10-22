import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name,age,score);
        System.out.println(result);
    }
}
