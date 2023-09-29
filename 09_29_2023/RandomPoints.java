public class RandomPoints{
    public static void main(String[] args) {
        int numberOfPoints = Integer.parseInt(args[0]);

        for (int i = 0; i < numberOfPoints; i++){
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);
            StdOut.printf("%d %d \n", x, y);
        }
    }
}