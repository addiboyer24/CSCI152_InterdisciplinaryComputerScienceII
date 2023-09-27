public class WarExample{
    public static void main(String[] args) {
        int numberOfPlays = Integer.parseInt(args[0]);

        String[] suits = { "diamonds" };
        String[] cardValues = { "2", "3", "4", "5" };

        String[] cardDeck = new String[suits.length * cardValues.length ];
        int[] cardDeckValues = new int[suits.length * cardValues.length];

        // Initialize the card deck.
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

            // Random index between 0-cardDeck.length -1.
            double r = Math.random();
            int n = cardDeckValues.length;
            int randomIndex = (int)(r*n);

            // Swapping operations.
            String tempCard = cardDeck[i];
            cardDeck[i] = cardDeck[randomIndex];
            cardDeck[randomIndex] = tempCard;

            int temp = cardDeckValues[i];
            cardDeckValues[i] = cardDeckValues[randomIndex];
            cardDeckValues[randomIndex] = temp;
        }

        /*for(int i = 0; i < cardDeckValues.length; i++){
            System.out.println(cardDeck[i]);
            System.out.println(cardDeckValues[i]);
        }*/

        // Deal with the number of games (passed in as command line arg).
        for (int gameNumber = 1; gameNumber <= numberOfPlays; gameNumber++){
            // Deal.
            int[] playerDeck = new int[cardDeckValues.length];
            int[] cpuDeck = new int[cardDeckValues.length];

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

                // Rotate entries of each players' deck up one index.
                for (int i = 1; i < playerCard; i++){
                    playerDeck[i-1] = playerDeck[i];
                }

                for (int i = 1; i < cpuCard; i++){
                    cpuDeck[i-1] = cpuDeck[i];
                }
                // ***

                if (playerValue > cpuValue){
                    // Player wins.
                    // put the cards from the hand at the bottom of the deck.
                    playerDeck[playerCard-1] = playerIndex;
                    playerDeck[playerCard] = cpuIndex;
                    cpuDeck[cpuCard-1] = 0; // deal with previous last card.
                    playerCard += 1; // gained a card.
                    cpuCard -= 1; // lost a card.
                }
                else if (playerValue < cpuValue){
                    // Cpu wins.
                    // put the cards from the hand at the bottom of the deck.
                    cpuDeck[cpuCard-1] = cpuIndex;
                    cpuDeck[cpuCard] = playerIndex;

                    playerDeck[playerCard-1] = 0; // deal with previous last card.
                    cpuCard += 1; // gained a card.
                    playerCard -= 1; // lost a card.
                }
                else{
                    // Tie..
                    // TODO!! Implement the "tiebreaker" logic
                }

                System.out.println("Player cards: " + playerCard);
                System.out.println("Cpu cards: " + cpuCard);
            }
        }
    }
}