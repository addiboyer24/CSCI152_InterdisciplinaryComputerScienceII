public class Standards{
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int sum = 0;
        for (int i = 0; i < number; i++){
            int integer = StdIn.readInt();
            sum += integer;
        }

        StdOut.printf("%d", sum);
    }
}