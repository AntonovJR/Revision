import java.math.BigInteger;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
      long snowballValue = 0;
        long realSnowballValue = Integer.MIN_VALUE;
        int snowballsNow = 0;
        int snowballsTime = 0;
        int snowballsQuality = 0;
        int endSnowball =0;
        int endTime = 0;
        int quality = 0;
        for (int i = 0; i <numberOfSnowballs ; i++) {
            snowballsNow = Integer.parseInt(scanner.nextLine());
            snowballsTime = Integer.parseInt(scanner.nextLine());
            snowballsQuality = Integer.parseInt(scanner.nextLine());
            snowballValue  = (long) Math.pow(snowballsNow/snowballsTime, snowballsQuality);
            if(snowballValue>realSnowballValue){
                realSnowballValue= snowballValue;
                endSnowball=snowballsNow;
                endTime = snowballsTime;
                quality = snowballsQuality;
            }
        }
        System.out.printf("%s : %s = %s (%s)",endSnowball,endTime,realSnowballValue,quality);
    }
}
