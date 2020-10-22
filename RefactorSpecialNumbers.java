import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num = 0;
        boolean isSpecialNumber = false;
        for (int i = 1; i<=n; i++){
            num = i;
            sum = 0;
            while ( num>0){
                sum += i % 10;
                num/=10;
            }

            isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf( "%d -> %b%n",i, isSpecialNumber);


        }
    }
}