import java.util.Scanner;

public class WhileLoops{
    public static void main(String[] args) {
        int cpuDiceRoll, userDiceRoll;
        Scanner myScanner = new Scanner(System.in);
        int funThreshold = 5;
        // boolean isPlaying = true;
        while (true){
            System.out.println("Hello World");
            System.out.println("How much fun are you having (1-10)");
            int fun = myScanner.nextInt();
            if (fun > funThreshold){
                System.out.println("Thanks for playing, glad you had fun!");
                break;
            }
            else{
                continue;
            }

            // System.out.println("Hi");
        }
    }
}