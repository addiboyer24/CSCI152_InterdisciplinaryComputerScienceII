public class Fact{

    // n = 3
    // return 3 * factorialRecursive(2)
    // return 2 * factorialRecursive(1) = 1

    public static long factorialIterative(long n){
        long result = 1;
        for(long i = n; i >= 1; i--){
            result *= i;
        }

        return result;
    }

    public static long factorialRecursive(long n){
        if (n == 0) return 1;

        if (n == 1) return 1;

        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(factorialRecursive(n));
        System.out.println(factorialIterative(n));
    }
}