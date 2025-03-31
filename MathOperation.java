
    public class MathOperation {

        public int multiply(int a, int b) {
            return a * b;
        }


        public int multiply(int a, int b, int c) {
            return a * b * c;
        }


        public static void main(String[] args) {

            // Method Overloading example
            MathOperation operations = new MathOperation();
            System.out.println("Multiplying two numbers: " + operations.multiply(2, 3));
            System.out.println("Multiplying three numbers: " + operations.multiply(2, 3, 4));


        }
    }