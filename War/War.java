import java.util.Scanner;

public class War {
    public static void main(String[] args) {

        int numberOfPlays = Integer.parseInt(args[0]);

        String[] suits = {
                "spades",
                "hearts",
                "clubs",
                "diamonds"
                };

        String[] cardStrings =
                { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };

        String[] cardDeck = new String[suits.length * cardStrings.length];
        int[][] cardDeckValue = new int[cardDeck.length][2];
        int cardValueIndex = 0;
        int suitValueIndex = 1;
        for (int i = 0; i < suits.length; i++){
            String suit = suits[i];
            for (int j = 0; j < cardStrings.length; j++){
                String cardString = cardStrings[j];
                String card = cardString + " of " + suit;
                cardDeck[i * cardStrings.length + j] = card;
                int[] column = cardDeckValue[i * cardStrings.length + j];
                column[cardValueIndex] = j;
                column[suitValueIndex] = i;
            }
        }

        int playerWins = 0;
        int cpuWins = 0;
        Scanner myScanner = new Scanner(System.in);

        for (int gameNumber = 0; gameNumber < numberOfPlays; gameNumber++){
            int[] playerDeck = new int[cardDeck.length];
            int[] cpuDeck = new int[cardDeck.length];

            for (int i = 0; i < cardDeck.length; i++){
                double r = Math.random();
                int n = cardDeck.length;
                int randomIndex = (int)(r * n);

                String tempCard = cardDeck[randomIndex];
                int[] tempCardValue = cardDeckValue[randomIndex];

                cardDeck[randomIndex] = cardDeck[i];
                cardDeckValue[randomIndex] = cardDeckValue[i];

                cardDeck[i] = tempCard;
                cardDeckValue[i] = tempCardValue;
            }

            boolean playerGoesFirst = (int)(Math.random() * 2) == 1;

            int cardNumber = 0;
            for (int i = 0; i < cardDeck.length; i+=2){

                int playerCard = playerGoesFirst ? 0 : 1;

                int cpuCard = playerGoesFirst ? 1 : 0;

                playerDeck[cardNumber] = i + playerCard;
                cpuDeck[cardNumber] = i + cpuCard;
                cardNumber += 1;
            }

            int playerCards = cardDeck.length / 2;
            int cpuCards = cardDeck.length / 2;
            int numberOfTurns = 0;

            int playerCard;
            int cpuCard;
            int playerValue;
            int cpuValue;
            do{
                playerCard = playerDeck[0];
                cpuCard = cpuDeck[0];
                playerValue = cardDeckValue[playerCard][0];
                cpuValue = cardDeckValue[cpuCard][0];

                boolean isPlayerWinner = playerValue > cpuValue;
                boolean isCpuWinner = playerValue < cpuValue;

                for (int i = 1; i < playerCards; i++){
                    playerDeck[i-1] = playerDeck[i];
                }

                for (int i = 1; i < cpuCards; i++){
                    cpuDeck[i-1] = cpuDeck[i];
                }

                if (isPlayerWinner){ // Player wins.

                    playerDeck[playerCards-1] = playerCard;
                    playerDeck[playerCards++] = cpuCard;

                    cpuDeck[--cpuCards] = 0;
                }
                else if (isCpuWinner){ // Cpu wins.
                    cpuDeck[cpuCards-1] = cpuCard;
                    cpuDeck[cpuCards++] = playerCard;

                    playerDeck[--playerCards] = 0;
                }
                else{ // Tie, default to cpu wins for now.
                    playerValue = cardDeckValue[playerCard][suitValueIndex];
                    cpuValue = cardDeckValue[cpuCard][suitValueIndex];

                    if (playerValue > cpuValue){
                        playerDeck[playerCards-1] = playerCard;
                        playerDeck[playerCards++] = cpuCard;

                        cpuDeck[--cpuCards] = 0;
                    }
                    else if(playerValue < cpuValue){
                        cpuDeck[cpuCards-1] = cpuCard;
                        cpuDeck[cpuCards++] = playerCard;

                        playerDeck[--playerCards] = 0;
                    }
                    else{
                        System.out.println("Problem!!!");
                    }
                }

                numberOfTurns += 1;
            }
            while (cpuCards != 0 && cpuCards != cardDeck.length && playerCards != 0 && playerCards != cardDeck.length);

            playerWins += playerCards > cpuCards ? 1 : 0;
            cpuWins += cpuCards > playerCards ? 1 : 0;

            System.out.println("Game " + (gameNumber + 1) + " took " + numberOfTurns + " turns.");
            String result = playerCards > cpuCards ? "won" : "lost";
            System.out.println("The player " + result + " that game.\n");

            if (numberOfPlays-1 != gameNumber){
                System.out.println("Play again? (y/n)");
                String userInput = myScanner.next();
                if (userInput.equals("n")){
                    break;
                }
            }
        }

        System.out.println("Thanks for playing!");
        System.out.println("Final Results:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Cpu wins: " + cpuWins);
    }
}
