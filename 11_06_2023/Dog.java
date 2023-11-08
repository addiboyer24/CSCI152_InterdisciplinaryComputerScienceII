import java.awt.*;

import java.awt.Color;

public class Dog implements Animal{ // Dog must implement the methods in Animal interface.
    // Instance variables.
    private String name;
    private char sex;
    private String dob;
    private Color color;

    public Dog(String name, char sex, String dob, Color color){
        this.name = name;
        this.sex = sex;
        this.dob = dob;
        this.color = color;
    }

    // Instance methods.
    public String speak(){
        return "WOOF";
    }

    public boolean isBirthday(String dateToCompare){
        // return this.dob == dateToCompare; // What's the difference?
        return this.dob.equals(dateToCompare);
    }
}