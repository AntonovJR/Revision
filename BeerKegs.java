import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double largest = Double.MIN_VALUE;
        String largestKeg = "";
        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI*radius*radius*height;
            if (volume>largest){
                largestKeg=name;
                largest=volume;
            }

        }
        System.out.println(largestKeg);
    }
}
