public class MultiArrays{
    public static void main(String[] args) {
        if (args.length == 2){
            int rows = Integer.parseInt(args[0]);
            int cols = Integer.parseInt(args[1]);

            int[][] arrayA = new int[rows][cols];
            int[][] arrayB = new int[rows][cols];

            int[][] arraySum = new int[rows][cols];


            for (int i = 0; i < arrayA.length; i++){

                for (int j = 0; j < arrayA[i].length; j++){
                    arrayA[i][j] = 1;
                    arrayB[i][j] = 3;
                }
            }

            for (int i = 0; i < arrayA.length; i++){
                for (int j = 0; j < arrayA[i].length; j++){
                    arraySum[i][j] = arrayA[i][j] + arrayB[i][j];
                }
            }

            for (int i = 0; i < arrayA.length; i++){
                for (int j = 0; j < arrayA[i].length; j++){
                    System.out.print(arraySum[i][j]);
                }
                System.out.println();
            }
            // 1 1
            // 1 1

            // 3 3
            // 3 3

            // 4 4
            // 4 4
            int[][] extraArray = { {4, 4}, {4, 4}};
        }
        else{
            System.out.println("Usage java MultiArrays rows cols");
        }
    }
}