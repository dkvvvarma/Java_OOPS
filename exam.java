import java.util.Scanner;

public class PatternDisplay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Choose a pattern to display:");
            System.out.println("1. Pattern 1");
            System.out.println("2. Pattern 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayPattern1();
                    break;
                case 2:
                    System.out.print("Enter the number of rows: ");
                    int numRows = input.nextInt();
                    displayPattern2(numRows);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 3);
        input.close();
    }

    public static void displayPattern1() {
        for (int i = 5; i >= 1; i--) {
            for (char j = 'A'; j <= 'A' + i - 1; j++) {
                System.out.print(j);
            }
            for (int k = 5 - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int k = 5 - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void displayPattern2(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            for (char j = 'A'; j <= 'A' + numRows - i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = numRows - i + 1; j >= 1; j--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
