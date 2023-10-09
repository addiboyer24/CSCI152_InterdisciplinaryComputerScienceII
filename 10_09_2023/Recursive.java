public class Recursive{

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else if (n == 1){ // Base case i.e. what we know.
            return 1;
        }
        else{ // Reduction step.
            return n * factorial(n-1);
        }
    }

    // n - 5
    // factorial(5)
    // return 5 * factorial(4)
    // factorial(4)
    // return 4 * factorial(3)
    // factorial(3)
    // 3 * factorial(2)
    // factorial(2)
    // 2 * factorial(1) = 1
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int nFactorial = factorial(n);
        StdOut.printf("%d! = %d", n, nFactorial);
    }
}