import static java.lang.Character.valueOf;

public class Hello2Plus2{

    // main method, the entry point to your program.
    public static void main(String[] args){
        char firstLetterOfName = args[1].toCharArray()[0];

        System.out.println("The first letter of your name is? " + firstLetterOfName);
        // Three types of conversions*
        // Automatic type conversion.
        String first = "2" + 2;
        double second = 2 + 2.0;

        // Casting.
        short third = 2 + (int)2.0;

        // Explicit type conversion.
        boolean isUserEnteredValue = args.length > 0;

        // Initialization (data type to name)
        // Random number between
        double r = Math.random();
        int fourth = (int)(Math.random() * 10);
        if (isUserEnteredValue){

            // Assignment (update value referenced by the name).
            fourth = Integer.parseInt(args[0]);

            // What kind of type conversion here?
            System.out.println("You entered " + fourth);
        }
        else{
            System.out.println("The computer generated you a pseudorandom number: " + fourth);
        }

        System.out.println(first);
        System.out.println(second);
        System.out.println(third); // type, value.
    }
}