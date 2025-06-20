import java.io.FileNotFoundException;

public class Main {

    
    static void myMethod(int num, int divisor, int index) throws ArithmeticException, FileNotFoundException {
        if (index == 2) {
            throw new FileNotFoundException("Simulated file missing at index " + index);
        }
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero at index " + index);
        }

        int result = num / divisor;
        System.out.println(num + " / " + divisor + " = " + result);
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 15, 0, 12, 5};
        int num = 60;

        for (int i = 0; i < arr.length; i++) {
            try {
                myMethod(num, arr[i], i);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("Caught FileNotFoundException: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Caught IllegalArgumentException (not thrown)");
            }
        }
    }
}
