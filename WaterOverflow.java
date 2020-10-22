import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int volume = 0;
        int capacity = 255;
        int sum = 0;
        for (int i = 0; i <numberOfLines ; i++) {
            volume = Integer.parseInt(scanner.nextLine());
            sum+=volume;
            if(sum>capacity){
                System.out.println("Insufficient capacity!");
                sum-=volume;
            }
        }
        System.out.println(sum);
    }
}
