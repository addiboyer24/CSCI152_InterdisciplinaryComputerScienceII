public class RaggedArrays{
    public static void main(String[] args) {
        int numberOfRows = Integer.parseInt(args[0]);

        // 1d arrays.
        int[] regularArray = new int[numberOfRows];

        // 2d arrays.
        int[][] regularArray2d = new int[numberOfRows][numberOfRows];

        // we can create multidimensional arrays > 2.
        int[][][] regularArray3d = new int[numberOfRows][numberOfRows][numberOfRows];

        int[][] raggedArray = new int[numberOfRows][];

        for (int i = 0; i < raggedArray.length; i++){
            double r = Math.random();
            int n = 11;
            int randomSize = (int)(n*r) + 1;
            raggedArray[i] = new int[randomSize];
        }

        /*
        for (int i = 0; i < raggedArray.length; i++){
            for (int j = 0; j < raggedArray[i].length; j++){
                int value = raggedArray[i][j];
                System.out.print(value);
            }
            System.out.println();
        }*/

        int[] array = {1, 2, 3, 4, 5, 0};
        int numberOfCards = 5;

        // {2, 3, 4, 5}
        int sum = 0;
        int cardValue = array[0];
        for (int i = 1; i < array.length; i++){
            array[i-1] = array[i];
        }

        array[numberOfCards-1] = cardValue;
        array[numberOfCards] = 6;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        // [5][6][0] - player (2)
        // [8][9][4][7] - cpu (4)
        // draw card from each deck
        // for each card we need the value.
        // compare the values to see who won.
        // when I win, number of cards in deck + 1.
        // when I lose, number of cards in deck -1.
    }
}