public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        Calculator calculator = new Calculator();
        System.out.println(a + " + " + b + " equals " + calculator.add(a, b));
        System.out.println(a + " - " + b + " equals " + calculator.sub(a, b));
    }
}
