public class HelloMath{
    public static void main(String[] args){
        double player1Spent = 0;
        double costToPlay = 0.25;

        boolean notAWinner = true;
        int numberOfRows = Integer.parseInt(args[0]);
        int numberOfCols = Integer.parseInt(args[1]);
        int numberOfSlots = numberOfRows * numberOfCols;

        // ***
        // ***
        // ***
        char[][] board = new char[numberOfRows][numberOfCols];
        while(notAWinner){
            player1Spent += costToPlay;
            int clawXLocation = RandomNumberGenerator.randomNumber(numberOfRows);
            int clawYLocation = RandomNumberGenerator.randomNumber(numberOfCols);

            int prizeXLocation = RandomNumberGenerator.randomNumber(numberOfRows);
            int prizeYLocation = RandomNumberGenerator.randomNumber(numberOfCols);

            String prizeLocation = "Prize: x: " + prizeXLocation + ", y: " + prizeYLocation;
            String clawLocation = "Claw: x: " + clawXLocation + ", y: " + clawYLocation;
            System.out.println(prizeLocation);
            System.out.println(clawLocation + "\n");

            // Extra Credit: write code to print out the result of each play of the claw machine*

            // Equality operator.
            notAWinner = !((clawXLocation == prizeXLocation) && (clawYLocation != prizeYLocation));
        }
        System.out.println("You won, it cost you $" + player1Spent + " to get some candy!" );
    }
}