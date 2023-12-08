public class Sorting {

    private static void exch(int[] myArray, int i, int j){
        int temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    private static void exch(Comparable[] myArray, int i, int j){
        Comparable temp = myArray[i];
        myArray[i] = myArray[j];
        myArray[j] = temp;
    }

    public static boolean isSorted(Comparable[] myArray, int i){
        for(int curIndex = 1; curIndex < i; curIndex++){
            Comparable leftValue = myArray[curIndex - 1];
            Comparable rightValue = myArray[curIndex];
            if (leftValue.compareTo(rightValue) > 0) return false;
        }

        return true;
    }

    public static boolean isSorted(int[] myArray, int i){
        for(int curIndex = 1; curIndex < i; curIndex++){
            int leftValue = myArray[curIndex - 1];
            int rightValue = myArray[curIndex];
            if (leftValue > rightValue) return false;
        }

        return true;
    }

    public static void selectionSort(int[] myArray){
        int n = myArray.length;
        // 3, 1, 2
        for (int i = 1; i < n; i++){
            for (int j = i; j > 0; j--){
                if (myArray[j] > myArray[j-1]) break;

                exch(myArray, j, j-1);
            }
            assert isSorted(myArray, i) : "Something is wrong with insertion sort";
        }
    }

    public static void selectionSort(Comparable[] myArray){
        int n = myArray.length;
        // 1, 2, 3
        for (int i = 1; i < n; i++){
            for (int j = i; j > 0; j--){
                if (myArray[j].compareTo(myArray[j-1]) > 0) break;

                exch(myArray, j, j-1);
            }
            assert isSorted(myArray, i) : "Something is wrong with insertion sort";
        }
    }
    public static void main(String[] args) {
        int[] myArrayWorst = { 3, 2, 1 }; // runtime ~ 1/2n^2
        int[] myArrayBest = {1, 2, 3 }; // runtime ~ n.
        int[] myArrayAverage = {2, 1, 3 }; // runtime ~ 1/4n^2

        int[] myArray = { 3, 2, 1 };
        StdOut.println("Is initial array sorted? " + isSorted(myArray, myArray.length));
        selectionSort(myArray);
        for (int i = 0; i < myArray.length; i++){
            StdOut.println(myArray[i]);
        }
        StdOut.println(isSorted(myArray, myArray.length));
    }
}