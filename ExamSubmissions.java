import java.util.Scanner;

public class ExamSubmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int problems = Integer.parseInt(scanner.nextLine());
        double subs = students*Math.ceil(problems*2.8);
        double more = Math.ceil(students*Math.floor(1.0*problems/3));
        double total = subs+more;
        double space = Math.ceil(total/10)*5;
        System.out.printf("%.0f KB needed",space);
        System.out.printf("%n%.0f submissions",total);


    }
}
