public class ArrayHelper{
    public static int[] flatten(int[][] my2DArray){
        int[] result = my2DArray[0];
        for (int i = 1; i < my2DArray.length; i++){
            result = concat(result, my2DArray[i]);
        }

        return result;
    }

    public static int[] concat(int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];

        int pointer = 0;
        for (int i = 0; i < array1.length; i++){
            result[pointer++] = array1[i];

        }
        for (int i = 0; i < array2.length; i++){
            result[pointer++] = array2[i];
        }

        return result;
    }

    public static void shuffle(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            int randomIndex = (int)(Math.random() * myArray.length);
            int tempValue = myArray[randomIndex];
            myArray[randomIndex] = myArray[i];
            myArray[i] = tempValue;
        }
    }

    public static void print(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            StdOut.printf("%d\t", myArray[i]);
        }
    }


    public static void main(String[] args) {
        int[][] my2DArray = {{1,2}, {3,4}};
        int[] flattenedArray = flatten(my2DArray);
        print(flattenedArray);
        StdOut.println();
        shuffle(flattenedArray);
        print(flattenedArray);
    }
}