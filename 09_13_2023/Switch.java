import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {

        System.out.println("What's your favorite animal?"
        +"1. Cat\n"
        +"2. Dog\n"
        +"3. Hamster");

        Scanner myScanner = new Scanner(System.in);
        String favoriteAnimal = myScanner.next();

        // Exam q, write this if, else if, else as a switch statement.
        /*
        if (favoriteAnimal.equals("Cat")){

        }
        else if(favoriteAnimal.equals("Dog")){

        }
        else if(favoriteAnimal.equals("Hamster")){

        }
        else{
            System.out.println("Your animal was not a choice.");
        }

        switch(favoriteAnimal){
            case "Cat":{
                System.out.println("Cats are cool");
                break;
            }
            case "Dog":{
                System.out.println("Dogs drool");
                break;
            }
            case "Hamster":{
                System.out.println("Hamsters run");
                break;
            }
            default:{
                System.out.println("Your animal was not a choice.");
                break;
            }*/

        // ?, :
        // String printValue = isFriday ? "Yahoo" : "Boo";

        boolean isFriday = false;
        String printValue;
        if (isFriday){
            printValue = "Yahoo";
        }
        else{
            printValue = "Boo";
        }
    }
}