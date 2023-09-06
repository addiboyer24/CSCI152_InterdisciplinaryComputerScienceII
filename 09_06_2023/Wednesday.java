public class Wednesday{ // Class name (same as the file name).
    public static void main(String[] args){ // access level, static - invoke main without instantiating an instance of Wednesday.java
        // void = return type, main - function name, () - Parameters (type name)
        // Method body.

        // Explicit cast.
        double userEntered = Integer.parseInt(args[0]);

        //
        double r = Math.random();
        double n = 10;
        int randomNumber = (int)(r * (userEntered+1));

        // Three operations for booleans. (&&, ||, !).
        boolean isEqual = (userEntered == randomNumber);

        boolean isEqualAnd = (isEqual && (userEntered % 2 == 0));

        boolean isEqualOr = (isEqual || (userEntered % 2 == 0));

        boolean isEqualNot = !isEqualAnd;

        boolean isTwoGreaterThan3 = 2 > 3;

        // Bonus - null coalescing operator (not in scope of this class).
        String myString = isEqual ? "Yes" : "No";
        System.out.print(isTwoGreaterThan3);
        /*


        String myString = "\""; // double quote.
        String myString2 = "\'"; // single quote.
        String myString3 = "\n"; // newline.
        String myString4 = "\t"; // tab.*/

        // \r
        /*
        System.out.println(myString);
        System.out.print(myString2);

        // What's the + operator called (Strings).
        // Concatenation*
        System.out.print(myString3 + myString + "Hello World" + myString);*/

        // char - concatenate.
        // int - arithmetic operations +, -, /, *, %.
        // double - arithmetic operations +, -, /, *
        // boolean - and (&&), or (||), not (!) - boolean operations.
        // mixed equality operations. == (equal), < (less than), > (greater than), <=, >=, != (not equal)

    }
}