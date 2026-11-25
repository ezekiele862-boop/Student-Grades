import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int student = 1; student <=5; student++){
            System.out.println("Enter student Name: ");
            String name = scanner.next();

            System.out.println("Enter student grade: ");
            int score = scanner.nextInt();

            switch (score/10){
                case 10:
                case 9:
                case 8:
                case 7:
                    System.out.println("A");
                    break;
                case 6:
                    System.out.println("B");
                    break;
                case 5:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("F");


            }
        }
    }
}
