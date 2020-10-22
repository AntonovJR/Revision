import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spiceQuantity = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int counter = 0;
        while (spiceQuantity>=100) {

            total += spiceQuantity - 26;
            counter++;
            spiceQuantity -= 10;


        }
        total -= 26;
        if(total<0){
            total = 0;
        }
        System.out.println(counter);
        System.out.println(total);
    }
}
