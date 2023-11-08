public class CandyBar extends Item{
    // Instance variables 1 (class level scope).
    private double calories;

    public CandyBar(String name, double price, double calories){ // Method level scope.
        super(name, price); // has to be the first statement in constructor.
        this.calories = calories;
    }

    // Instance methods.
    // getter, setter.

    public static void main(String[] args) {
        CandyBar myBar = new CandyBar("Skittles", 2.00, 250.00);
        System.out.println(myBar.getName());
        myBar.setName("Rainbow Buttons");
        System.out.println(myBar.getName());
    }
}