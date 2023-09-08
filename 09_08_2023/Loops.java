public class Loops{
    public static void main(String[] args) {
        // given some integer n (non negative,
        // non-zero) print the numbers from 0 to n inclusive.
        int x = 0;
        int n = Integer.parseInt(args[x++]);

        // i = i + 1
        // i += 1
        // e.g. n = 10.
        for (int i = 0; i <= n; ++i){
            System.out.println(i);
        }
    }
}