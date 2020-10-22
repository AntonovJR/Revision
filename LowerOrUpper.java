
import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char n = scanner.next().charAt(0);
        if(Character.isUpperCase(n)){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
