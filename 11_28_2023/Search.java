public class Search{

    public static int binarySearch(int[] myArray, int numberToFind, int i, int j){
        int mid = i + (j - i) / 2;
        if (i > j){
            return -1; // Base case to cover when numberToFind is not in the array*
        }
        int currentValue = myArray[mid];
        if (currentValue == numberToFind){
            return mid; // Base case when we find our number.
        }
        else if (currentValue > numberToFind){
            return binarySearch(myArray, numberToFind, i, mid - 1); // Reduction step.
        }
        else{
            return binarySearch(myArray, numberToFind, mid + 1, j); // Reduction step.
        }
        // Best case - constant time (find our element on the first recursive call)
        // Worst case - lg(n) (didn't find out element, or found element on last recursive call)
        // Average case - worst case / 2 lg(sqrt(n)) 1/2 lg(n)
    }

    public static int bruteForceSearch(int[] myArray, int numberToFind){
        int index = -1;
        for (int i = 0; i < myArray.length; i++){
            int valueToCompare = myArray[i];
            if (valueToCompare == numberToFind){
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] myArray = { 1, 2, 3, 4, 5, 6 };
        int indexOfNumber = binarySearch(myArray, n, 0, myArray.length - 1);
        StdOut.printf("Number we're searching for: %d, Index of Number: %d", n, indexOfNumber);
    }
}