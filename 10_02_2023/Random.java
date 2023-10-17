public class Random{
    public static void main(String[] args) {

    }

    // Constructor - default constructor.
    public Random(){

    }

    // Random myRandom = new Random();
    // myRandom.methodName(); -- not static.
    // Random.methodName() -- static.
    public static String GetRandom(int n){
        if (n > 10){
            return "Greater than 10";
        }
        else if (n == 10){
            return "equal to 10";
        }

        String returnValue = "a " + " b";
        // literal.
        // variable name.
        // function call to another function with compatible return type.
        return returnValue;
    }

    private static String GetRandom(int n, String f, char g){
        return "HelloWorld";
    }

    public int GetRandom(int start, int n){
        return 0;
    }

    public static void HelloWorld(){
        System.out.println("Hello World!");
    }
}