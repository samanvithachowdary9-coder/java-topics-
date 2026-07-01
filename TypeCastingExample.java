public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int num = 10;
        double value = num;
        System.out.println("Implicit Casting: " + value);

        // Explicit Casting (Narrowing)
        double pi = 3.14;
        int result = (int) pi;
        System.out.println("Explicit Casting: " + result);
    }
}