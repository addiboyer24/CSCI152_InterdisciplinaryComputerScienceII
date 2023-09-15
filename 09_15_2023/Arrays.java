public class Arrays{
    public static void main(String[] args) {

        /*int length = Integer.parseInt(args[0]);

        // Declaration.
        int[] myArray;

        // Assignment.
        myArray = new int[length];

        // Array value initialization (in java primatives are assigned default values)
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = 1;
        }*/

        String[] suits = { "hearts", "spades", "diamonds", "clubs" };
        String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};

        int cardDeckSize = suits.length * cardValues.length;

        String[] cardDeck = new String[cardDeckSize];

        for (int i = 0; i < suits.length; i++){
            String suit = suits[i];
            for (int j = 0; j < cardValues.length; j++){
                String cardValue = cardValues[j];
                String card = cardValue + " of " + suit;
                cardDeck[cardValues.length*i + j] = card;
            }
        }

        for (int i = 0; i < cardDeck.length; i++){
            System.out.println(cardDeck[i]);
        }
    }
}