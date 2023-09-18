public class MoreArrays{
    public static void main(String[] args) {
        /*
        int n;
        n = args.length == 1 ? Integer.parseInt(args[0]) : 5;

        int[] myArray;
        myArray = new int[n];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = 1;
        }

        // int[] array = new int[n];*/

        String[] suits = { "diamonds", "clubs", "hearts", "spades" };
        String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };

        String[] cardDeck = new String[suits.length * values.length];

        for (int i = 0; i < suits.length; i++){
            String suit = suits[i];
            for (int j = 0; j < values.length; j++){
                String value = values[j];
                String card = value + " of " + suit;
                cardDeck[i * values.length + j] = card;
            }
        }

        for (int i = 0; i < cardDeck.length; i++){
            System.out.println(cardDeck[i]);
        }

        for (int i = 0; i < cardDeck.length; i++){
            double r = Math.random();
            int randomIndex = (int)(cardDeck.length * r);
            String temp = cardDeck[randomIndex];
            cardDeck[randomIndex] = cardDeck[i];
            cardDeck[i] = temp;
        }

        // [][][][][]
        System.out.println();

        for (int i = 0; i < cardDeck.length; i++){
            System.out.println(cardDeck[i]);
        }
    }
}