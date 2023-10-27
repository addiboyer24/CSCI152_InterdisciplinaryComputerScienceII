public class BadFib{

    private static int longestFibLong = 92;
    private static long[] cache = new long[longestFibLong];

    public static long fib(int n){
        // Base Case.
        if (n == 0) return 0;

        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }

    public static long fibBottomUp(int n){
        long[] answers = new long[n+1];
        answers[0] = 0;
        if (n > 0){
            answers[1] = 1;
        }

        for (int i = 2; i <= n; i++){
            answers[i] = answers[i-1] + answers[i-2];
        }

        return answers[n];
    }

    public static long fibTopDown(int n){
        if (n == 0) return 0;

        if (n == 1) return 1;

        if (cache[n] > 0) return cache[n];

        cache[n] = fibTopDown(n - 1) + fibTopDown(n - 2);
        return cache[n];
    }

    public static void main(String[] args) {
        // F(n) = F(n-1) + F(n-2) - Recurrence Relation.
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++){
            System.out.println(i + ": " + fibTopDown(i));
        }
    }
}