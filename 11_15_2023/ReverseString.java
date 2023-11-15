public class ReverseString{
    public static String reverse(String stringToReverse){
        return stringToReverse;
    }

    public static boolean isThisSpecialWord(String specialWord){
        return specialWord.equals(reverse(specialWord));
    }

    public static void printPrompt(String candidate){
        StdOut.printf("%s \"%s\" this special word to it's reversed string?\n\n", candidate, isThisSpecialWord(candidate) ? "is" : "is not");
    }
    public static void main(String[] args) {
        String candidatePass = "saippuakivikauppias";
        String candidateFail = "cineangiocardiographic";
        String errorMessage = "Your implementation of reverse is not correct!";
        assert isThisSpecialWord(candidatePass) : errorMessage;
        assert !isThisSpecialWord(candidateFail) : errorMessage;
        printPrompt(candidatePass);
        printPrompt(candidateFail);

    }
}