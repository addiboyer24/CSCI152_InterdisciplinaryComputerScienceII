public class StdInRedirect{
    public static void main(String[] args) {
        int sum = 0;
        while (!StdIn.isEmpty()){
            int integer = StdIn.readInt();
            sum += integer;
        }

        StdOut.printf("%d", sum);
    }
}