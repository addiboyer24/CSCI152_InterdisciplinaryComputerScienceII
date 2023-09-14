public class Binary{
    public static void main(String[] args) {
        // Explicit casting.
        int number = Integer.parseInt(args[0]);
        int originalNumber = number;

        int numberOfPositionsNeeded = 0;
        while(number > 0){
            // variable numberOfPositionsNeeded. (4 ways to increment the value).
            ++numberOfPositionsNeeded; // 3
            // number = number / 2;
            number /= 2; // 0
            /*numberOfPositionsNeeded++;
            numberOfPositionsNeeded += 1;
            numberOfPositionsNeeded = numberOfPositionsNeeded + 1;*/
        }
        System.out.println(numberOfPositionsNeeded);
    }
}