public class Review{ // Class name.
    public static void main(String[] args){ // parameters.

        // Explicit Casting.
        int value = Integer.parseInt(args[0]);
        System.out.println("You entered: " + value);

        // Method body.
        System.out.println("Hello World!");

        // declaration, or initialization.
        int a, b, c;

        // Assignment.
        a = 10;

        int d = 20;

        // Casting (type, value) - Implicit (Automatic)
        // (String, "2+20")
        System.out.println("2" + "+" + d);

        double pi = 3.14;
        double sinPi = Math.sin(a);

        // Traditional Cast (Explicit).
        double r = Math.random();
        int n = 11;
        int randomNumber = (int)(r * n);

        System.out.println("Random Number: " + randomNumber);

        boolean isThisClassFun = true;
        System.out.println(isThisClassFun);
    }
}