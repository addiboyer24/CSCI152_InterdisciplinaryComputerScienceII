public class Friday{ // class definition.
    public static void main(String[] args) { // main method.
        // main method body.
        /*
        System.out.println("Hello World");
        System.out.println("World Hello");*/
        // Explicit cast from String to int.
        int n = Integer.parseInt(args[0]);

        // Declaration.
        boolean isTwoGreaterThanN;
        boolean isTwoEqualToN;
        boolean isWeekend = false;

        // trace.
        // n = user enters in (2)
        // isTwoGreaterThanN = 2 > 2 = false
        // isTwoEqualToN = (2 == 2) = true
        // Assignment.

        isTwoGreaterThanN = 2 > n;
        isTwoEqualToN = (2 == n);
        // myDog
        // myDog.GetName();
        // if (myDog != null && myDog.name == "Charlie"){}
        // Example of short circuiting
        if (isWeekend && isTwoGreaterThanN){ // code executes when value passed to parenthesis is true.
            System.out.println("2 is greater than your number");
        }
        else if(isTwoEqualToN){
            System.out.println("2 is equal to your number");
        }
        else{ // Default execute if all if or else if statements above have false evaluation.
            System.out.println("2 is not greater than your number i.e. 2 is less than or equal to your number");
        }

    }
}