import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double price = 0;
        if (type.equals("students")){
            if (day.equals("friday")){
                price =8.45;
            }
             if (day.equals("saturday")){
                 price =9.8;
            }
           if (day.equals("sunday")){
               price =10.46;
            }
           if (people>=30){
               price = price*0.85;
           }
        }
        if (type.equals("business")){
            if (day.equals("friday")){
                price =10.9;
            }
            if (day.equals("saturday")){
                price =15.6;
            }
            if (day.equals("sunday")){
                price =16;
            }
            if (people>=100){
               people-=10;
            }
        }
        if (type.equals("regular")){
            if (day.equals("friday")){
                price =15;
            }
            if (day.equals("saturday")){
                price =20;
            }
            if (day.equals("sunday")){
                price =22.5;
            }
            if (people>=10&&people<=20){
               price=price*0.95;
            }
        }
        System.out.printf("Total price: %.2f",price*people);

    }
}
