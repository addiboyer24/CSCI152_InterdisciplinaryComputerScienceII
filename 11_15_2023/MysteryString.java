import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;
import java.io.File;
public class MysteryString {
    public static String mysteryFunction(String inputString){
        char[] mysteryString = new char[inputString.length()];
        int lastIndex = mysteryString.length -1;
        for (int i = lastIndex; i >= 0; i--){
            mysteryString[lastIndex - i] = inputString.charAt(i);
        }
        return new String(mysteryString);
    }

    public static boolean isThisSpecialWord(String candidate){
        return candidate.equals(mysteryFunction(candidate));
    }

    public static void printPrompt(String candidate){
        StdOut.printf("%s \"%s\" this special word.\n\n", candidate, isThisSpecialWord(candidate) ? "is" : "is not");
    }
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Scanner myScanner = new Scanner(new File(fileName), Charset.defaultCharset());
        String[] candidates = myScanner.next().split(",");
        for (String candidate : candidates){
            printPrompt(candidate);
        }
    }
}