import java.util.Scanner;

public class ExamCategories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int complexity = Integer.parseInt(scanner.nextLine());
        int intricacy = Integer.parseInt(scanner.nextLine());
       int pages = Integer.parseInt(scanner.nextLine());

        if(complexity>=80&&intricacy>=80&&pages>=8){
            System.out.println("Legacy");
        } else if(complexity>=80&&intricacy<=10){
            System.out.println("Master");
        }else if(intricacy>=50&&pages>=2){
            System.out.println("Hard");
        }else if(complexity<=30&&pages<=1){
            System.out.println("Easy");
        }else if(complexity<=10){
            System.out.println("Elementary");
        }else{
            System.out.println("Regular");
        }

    }
}