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

    public static int globalCounter = 0;
    public static String globalMessage = "Bad global state";
    public static List<Object> globalList = new ArrayList<>();

    public void terribleMethod() throws Exception, RuntimeException, IllegalArgumentException, NullPointerException {
        int magic_number = 42;
        String WEIRD_Name = "inconsistent naming";
        boolean FLAG = true;

        if (FLAG == true) {
            if (magic_number == 42) {
                if (WEIRD_Name.length() > 0) {
                    if (globalCounter >= 0) {
                        if (globalList != null) {
                            globalCounter++;
                            globalCounter++;
                            globalCounter++;
                            globalCounter++;
                            globalCounter++;

                            for (int i = 0; i < 100; i++) {
                                for (int j = 0; j < 100; j++) {
                                    for (int k = 0; k < 100; k++) {
                                        for (int l = 0; l < 100; l++) {
                                            if (i % 2 == 0) {
                                                if (j % 3 == 0) {
                                                    if (k % 5 == 0) {
                                                        if (l % 7 == 0) {
                                                            System.out.println("Extreme nesting: " + i + j + k + l);
                                                            String extremelyLongVariableNameThatViolatesNamingConventionsAndMakesCodeUnreadableAndShouldNeverBeUsedInRealProjects = "terrible";
                                                            if (extremelyLongVariableNameThatViolatesNamingConventionsAndMakesCodeUnreadableAndShouldNeverBeUsedInRealProjects.equals("terrible")) {
                                                                try {
                                                                    Thread.sleep(1);
                                                                    Object obj = null;
                                                                    obj.toString();
                                                                } catch (InterruptedException e) {
                                                                    e.printStackTrace();
                                                                } catch (NullPointerException e) {
                                                                    e.printStackTrace();
                                                                } catch (RuntimeException e) {
                                                                    e.printStackTrace();
                                                                } catch (Exception e) {
                                                                    e.printStackTrace();
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
                    }
                }
            }
        }
    }

    public Object badReturnMethod(String input) {
        if (input == null) {
            return null;
        }
        if (input.equals("")) {
            return "";
        }
        if (input.equals("number")) {
            return 42;
        }
        if (input.equals("boolean")) {
            return true;
        }
        if (input.equals("list")) {
            return new ArrayList();
        }
        return new HashMap();
    }

    public void duplicatedCode3() {
        System.out.println("This is duplicated code");
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("Result: " + result);
        if (result > 10) {
            System.out.println("Greater than 10");
        }
    }

    public void duplicatedCode4() {
        System.out.println("This is duplicated code");
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("Result: " + result);
        if (result > 10) {
            System.out.println("Greater than 10");
        }
    }

    public void methodWithEmptyCatch() {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
        }
    }

    public void methodWithMagicNumbers() {
        int[] array = new int[9999];
        for (int i = 0; i < 9999; i++) {
            array[i] = i * 42 + 13 - 7 * 3 + 666;
        }

        if (array.length == 9999) {
            System.out.println("Magic number violation");
        }
    }

    @SuppressWarnings("all")
    public void methodWithSuppressedWarnings() {
        List raw = new ArrayList();
        raw.add("unchecked");
        raw.add(123);
        raw.add(true);

        String unused1 = "unused variable";
        int unused2 = 42;
        boolean unused3 = false;

        Object o = null;
        o.toString();
    }

    public class InnerClass {
        public class NestedInnerClass {
            public class DeeplyNestedClass {
                public class ExtremelyDeepClass {
                    public void deepMethod() {
                        System.out.println("Too much nesting");
                    }
                }
            }
        }
    }
//Komment
//COMMENT
// lorem ipsum dolor sit amet 
// consectetur adipiscing elit
// sed do eiusmod tempor incididunt ut labore et dolore magna aliqua
// Ut enim ad minim veniam
// quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat
// Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur
    public void methodWithoutBraces()
        if (true)
            System.out.println("Missing braces");
        else
            System.out.println("Still missing braces");
}