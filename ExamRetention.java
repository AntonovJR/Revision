import java.util.Scanner;

public class ExamRetention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int seasons = Integer.parseInt(scanner.nextLine());
        double survived = students;
        for (int i = 1; i <= seasons; i++) {
            for (int j = 0; j <2 ; j++) {
                survived = Math.ceil(survived * 0.9);
            }

            survived = Math.ceil(survived * 0.8);
            if(i%3==0){
                survived = survived+Math.ceil(survived*0.15);
            }else{
                survived = survived+Math.ceil(survived*0.05);
            }


        }
        System.out.printf("Students: %.0f",survived);
    }
}
