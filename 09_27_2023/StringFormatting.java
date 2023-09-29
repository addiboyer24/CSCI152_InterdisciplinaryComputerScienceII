public class StringFormatting{
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for (int i = 0; i < number; i++){
            int randomNumber = (int)(Math.random() * 10);
            StdOut.println(randomNumber);
        }
    }
}