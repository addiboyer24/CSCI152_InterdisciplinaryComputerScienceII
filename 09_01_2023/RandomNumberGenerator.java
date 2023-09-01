public class RandomNumberGenerator{

    // Returns a pseudorandom number between 0 and n-1.
    public static int randomNumber(int n){
        return (int)(Math.random() * n);
    }
}