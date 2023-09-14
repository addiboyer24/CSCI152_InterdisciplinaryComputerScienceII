public class DoWhile{
    public static void main(String[] args) {
        double r = Math.random();
        int n = 11;
        int offset = 1;
        int randomNumber = (int)(r * n) + offset;

        int milesRun = 0;
        double runningThreshold = 26.2;
        do{ // explain how this statement executes i.e. the control flow of a do while loop.
            milesRun += randomNumber;
            System.out.println("Running " + randomNumber + " today.");
        }
        while(milesRun <= runningThreshold);

        System.out.println("I ran " + milesRun);
    }
}