import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int problems = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int exams = 0;
        int examsTwo = 0;
        while (students >=10) {
            examsTwo += problems;
            energy += problems * 2;
            students -= problems;
            exams = students * 2;
            energy -= students * 2 * 3;
            students = (students + students / 10);
            if (energy <= 0) {
                problems = students * 2;
                System.out.println("The trainer is too tired!");
                System.out.printf("Questions asked: %d", exams);
                return;

            }
        }

        System.out.println("The students are too few!");
        System.out.printf("Problems solved: %d", examsTwo);


    }
}
