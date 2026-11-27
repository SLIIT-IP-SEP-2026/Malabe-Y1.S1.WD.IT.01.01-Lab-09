public class IT26102417Lab9Q3 {

    static int add(int x, int y) {
        return x + y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int square(int x) {
        return multiply(x, x);
    }

    public static void main(String[] args) {
        int r1 = square(add(multiply(3, 4), multiply(5, 7)));
        int r2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)² : " + r1);
        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + r2);
    }
}