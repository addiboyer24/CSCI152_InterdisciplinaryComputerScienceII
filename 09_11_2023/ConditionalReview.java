public class ConditionalReview{
    public static void main(String[] args) {

        // i = i + 1
        // i += 1
        // ++i
        // given the 4 parts of a for loop order them
        // based upon when they're evaluated.
        // 1. index, 2. exit criteria, 3. for loop body, 4. increment
        for (int i = 0; i < 5; i++){

            double r = Math.random();
            int n = 6;

            // Declaration.
            int diceRoll;

            int cpuDiceRoll = (int)(r * n) + 1;

            diceRoll = (int)(r * n) + 1;

            if (diceRoll > cpuDiceRoll){
                System.out.println("You win");
            }
            else if (diceRoll == cpuDiceRoll){
                System.out.println("You tie");
            }
            else{
                System.out.println("You lost");
            }
        }


    }
}