public class VendingMachineClient{
    public static void main(String[] args) {

        // lambda.
        ItemPrice myCandyBarPrice = (double basePrice) -> basePrice + (basePrice * 0.03);
        ItemPrice myToyPrice = (double basePrice) -> basePrice;

        Item myCandyBar = new CandyBar("Snickers", myCandyBarPrice.calculatePrice(1.25), 250.00);
        Item myToy = new Toy("Furbee", myToyPrice.calculatePrice(5.00), "blue");

        System.out.println(myCandyBar.getPrice());
        System.out.println(myToy.getPrice());
    }
}