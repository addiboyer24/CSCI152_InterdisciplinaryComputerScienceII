import java.util.Scanner;

public class Conditionals{
    public static void main(String[] args) {
        // The if statement.
        boolean conditionalValue = true; // all possible values of boolean i.e. true/false.

        int prizeValue = 20;
        if (conditionalValue){ // block of code executes if conditionalValue == true.

            // if /else (nesting*)
            conditionalValue = false;
            if (conditionalValue){
                prizeValue = 50;
            }
            else{
                prizeValue = 40;
            }
        }

        System.out.println("Prize value is " + prizeValue);

        // loops.
        // while, for, do while
        int i = 0;
        while(i < 10){
            i += 1; // Incrementing an integer.
        }

       for (i = 0; i < 10; i++){

       }
    }
}