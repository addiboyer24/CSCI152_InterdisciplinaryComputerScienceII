public class Item{
    // Instance variables.
    private String name;
    private double price;

    // Constructor.
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}