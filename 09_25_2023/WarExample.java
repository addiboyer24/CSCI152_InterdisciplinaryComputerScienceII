public class WarExample{
    public static void main(String[] args) {
        int numberOfPlays = Integer.parseInt(args[0]);

        String[] suits = { "diamonds" };
        String[] cardValues = { "2", "3", "4", "5" };

        String[] cardDeck = new String[suits.length * cardValues.length ];
        int[] cardDeckValues = new int[suits.length * cardValues.length];

        for (int i = 0; i < suits.length; i++){
            String suit = suits[i];
            for (int j = 0; j < cardValues.length; j++){
                String cardValue = cardValues[j];
                String card = cardValue + " of " + suit;
                cardDeck[i*cardValues.length + j] = card;
                cardDeckValues[i*cardValues.length + j] = j;
            }
        }

        /*for(int i = 0; i < cardDeckValues.length; i++){
            System.out.print(cardDeck[i]);
            System.out.println(cardDeckValues[i]);
        }*/

        // Shuffling.
        for (int i = 0; i < cardDeckValues.length; i++){
            double r = Math.random();
            int n = cardDeckValues.length;
            int randomIndex = (int)(r*n);
            String tempCard = cardDeck[i];

            int temp = cardDeckValues[i];
            cardDeckValues[i] = cardDeckValues[randomIndex];
            cardDeck[i] = cardDeck[randomIndex];
            cardDeckValues[randomIndex] = temp;
            cardDeck[randomIndex] = tempCard;
        }

        for(int i = 0; i < cardDeckValues.length; i++){
            // System.out.println(cardDeck[i]);
            // System.out.println(cardDeckValues[i]);
        }

        int[] playerDeck = new int[cardDeckValues.length];
        int[] cpuDeck = new int[cardDeckValues.length];

        for (int gameNumber = 1; gameNumber <= numberOfPlays; gameNumber++){
            // Deal.

            int playerCard = cardDeckValues.length / 2;
            int cpuCard = cardDeckValues.length / 2;

            // 0 -> 3 - 2
            int cardNumber = 0;
            // dealing.
            for (int i = 0; i < cardDeckValues.length; i+=2){
                playerDeck[cardNumber] = i;
                cpuDeck[cardNumber] = i+1;
                cardNumber += 1;
            }

            while (playerCard != 0 && playerCard != cardDeck.length && cpuCard != 0 && cpuCard != cardDeck.length){
                // Play the game.
                int playerIndex = playerDeck[0];
                int cpuIndex = cpuDeck[0];
                int playerValue = cardDeckValues[playerIndex];
                int cpuValue = cardDeckValues[cpuIndex];

                System.out.println("Player value: " + playerValue);
                System.out.println("Cpu value: " + cpuValue);

                for (int i = 1; i < playerCard; i++){
                    playerDeck[i-1] = playerDeck[i];
                }

                for (int i = 1; i < cpuCard; i++){
                    cpuDeck[i-1] = cpuDeck[i];
                }

                // [0][2][][]
                // [1][3][][]
                if (playerValue > cpuValue){
                    // Player wins.
                    playerDeck[playerCard-1] = playerIndex;
                    playerDeck[playerCard] = cpuIndex;
                    cpuDeck[cpuCard-1] = 0;
                    playerCard += 1;
                    cpuCard -= 1;
                }
                else if (playerValue < cpuValue){
                    // Cpu wins.
                    cpuDeck[cpuCard-1] = cpuIndex;
                    cpuDeck[cpuCard] = playerIndex;
                    playerDeck[playerCard-1] = 0;
                    cpuCard += 1;
                    playerCard -= 1;
                }
                else{
                    // Tie..
                }

                System.out.println("Player cards: " + playerCard);
                System.out.println("Cpu cards: " + cpuCard);
            }
        }
    }
}