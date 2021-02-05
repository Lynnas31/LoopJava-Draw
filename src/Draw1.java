import java.util.Scanner;

public class Draw1 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw square triangle");
            System.out.println("3. Draw  isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Draw the rectangle");
                    System.out.println("Enter the width");
                    int width = input.nextInt();
                    System.out.println("Enter the height");
                    int height = input.nextInt();
                    for (int i = 1; i < height; i++) {
                        for (int j = 1; j < width ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    System.out.println("Enter the side");
                    int  side = input.nextInt();
                    for (int i = 0; i < side; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    System.out.println("Enter the side");
                    int side2 = input.nextInt();
                    for (int i = 0; i <= side2; i++) {
                        for (int j = side2; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
