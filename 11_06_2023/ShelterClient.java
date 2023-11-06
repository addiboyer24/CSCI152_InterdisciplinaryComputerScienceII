import java.awt.Color;
public class ShelterClient{
    public static void main(String[] args) {
        /*
        // How to declare object from class?
        // Typename VariableName = value; -- Primatives.
        // Typename VariableName = new Constructor(arg1, arg2, ..); - Objects.
        Cat myCat = new Cat("Mittens", 'm', "06/06/1966", Color.BLACK);
        String whatDoesTheCatSay = myCat.speak();
        System.out.println(whatDoesTheCatSay);*/
        Animal myCat = new Cat("Mittens", 'm', "06/06/1966", Color.BLACK);
        Animal myDog = new Dog("Boots", 'f', "11/06/2023", Color.BLUE);

        Animal[] myAnimals = {myCat, myDog};
        for (int i = 0; i < myAnimals.length; i++){
            Animal myAnimal = myAnimals[i];
            System.out.println(myAnimal.speak());
        }
    }
}