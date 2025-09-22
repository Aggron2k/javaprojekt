import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        HelloWorld hw = new HelloWorld();
        hw.duplicatedMethod1();
        hw.duplicatedMethod2();
        hw.longComplexMethod();
        hw.methodWithManyParameters(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public void duplicatedMethod1() {
        System.out.println("This is duplicated code");
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("Result: " + result);
        if (result > 10) {
            System.out.println("Greater than 10");
        }
    }

    public void duplicatedMethod2() {
        System.out.println("This is duplicated code");
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("Result: " + result);
        if (result > 10) {
            System.out.println("Greater than 10");
        }
    }

    public void longComplexMethod() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        if (a > 0) {
            if (b > 1) {
                if (c > 2) {
                    if (d > 3) {
                        if (e > 4) {
                            System.out.println("Deep nesting violation");
                            for (int i = 0; i < 10; i++) {
                                for (int j = 0; j < 10; j++) {
                                    for (int k = 0; k < 10; k++) {
                                        System.out.println(i + j + k);
                                        if (i == j) {
                                            if (j == k) {
                                                System.out.println("Equal values");
                                                try {
                                                    int result = 10 / (i - j);
                                                } catch (ArithmeticException ex) {
                                                    System.out.println("Division by zero");
                                                } catch (Exception ex) {
                                                    System.out.println("Other exception");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        String longString = "This is a very long string that exceeds reasonable line length limits and should trigger a line length violation in most static analysis tools";
        System.out.println(longString);

        List unusedList = new ArrayList();
        Map unusedMap = new HashMap();
        Set unusedSet = new HashSet();
    }

    public void methodWithManyParameters(int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {
        System.out.println("Method with too many parameters");

        switch (p1) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            default:
                System.out.println("Default case");
        }
    }

    public String methodWithoutReturn() {
        System.out.println("This method should return a String but doesn't");
    }

    private void unusedPrivateMethod() {
        System.out.println("This method is never called");
    }
}