public class CustomString{

    // instance variables (declare here).
    private char[] value;

    public CustomString(){ // Default constructor.
    }

    public CustomString(char[] value){ // custom constructor.
        this.value = value;
    }

    public CustomString(String value){
        this.value = new char[value.length()];
        for (int i = 0; i < this.value.length; i++){
            this.value[i] = value.charAt(i);
        }
    }

    public int length(){
        return this.value.length;
    }

    public char randomChar(){
        int randomIndex = this.randomNumber(); // calling a private method within our class.
        return this.value[randomIndex];
    }

    public char charAt(int i){
        return this.value[i];
    }

    private int randomNumber(){
        return (int)(Math.random() * this.value.length);
    }

    public static void main(String[] args) {

    }
}