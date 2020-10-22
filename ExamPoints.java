import java.util.Scanner;

public class ExamPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problem = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String course = scanner.nextLine().toLowerCase();
        double total = 0;

        switch (problem) {
            case 1:
                switch (course) {
                    case "basics":
                        total = 8;
                        break;
                    case "fundamentals":
                        total = 11;
                        break;
                    case "advanced":
                        total = 14;
                        break;

                }
                break;
            case 2:
                switch (course) {
                case "basics":
                    total = 9;
                    break;
                case "fundamentals":
                    total = 11;
                    break;
                case "advanced":
                    total = 14;
                    break;

            }
                break;
            case 3:
                switch (course) {
                    case "basics":
                        total = 9;
                        break;
                    case "fundamentals":
                        total = 12;
                        break;
                    case "advanced":
                        total = 15;
                        break;

                }
                break;
            case 4:
                switch (course) {
                    case "basics":
                        total = 10;
                        break;
                    case "fundamentals":
                        total = 13;
                        break;
                    case "advanced":
                        total = 16;
                        break;

                }
                break;

        }
        double ocenka = points*(total/100);
        if (course.equals("advanced")){
            ocenka = ocenka*1.2;
        }
        if (course.equals("basics")&&problem==1){
            ocenka = ocenka*0.8;
        }

        System.out.printf("Total points: %.2f",ocenka);
    }
}
