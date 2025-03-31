
    import java.util.Scanner;

    public class Division {
        public void divideNumbers() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            try {
                int result = num1 / num2; // Division
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero"); // Exception handling
            } finally {
                scanner.close();
            }
        }


        public static void main(String[] args) {
            Division division = new Division();
            division.divideNumbers();
        }
    }