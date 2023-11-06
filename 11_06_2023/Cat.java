import java.awt.Color;
public class Cat implements Animal{ // Class declaration.
    // Instance variables.
    private String name;
    private char sex;
    private String dob;
    private Color color;

    // Constructor(s).
    public Cat(String name, char sex, String dob, Color color){ // Default constructor (in java don't have to explicitly define)*
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.color = color;
    }

    public Cat(String name){
        this.name = name;
        // supply default values for remainder of instance variables.
    }

    // Instance methods.
    public String speak(){
        return "MEOW";
    }

    public boolean isBirthday(String dateToCompare){
        // return this.dob == dateToCompare; // What's the difference?
        return this.dob.equals(dateToCompare);
    }

}