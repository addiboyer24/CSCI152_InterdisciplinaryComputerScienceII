public class TestClient{
    private static final String openCurlyBrace = "{";
    private static final String closedCurlyBrace = "}";

    public static boolean isBalanced(String fileContent){
        int maxCapacity = fileContent.length();
        StringStack myStack = new StringStack(fileContent.length());
        boolean balanced = false;
        for (int i = 0; i < fileContent.length(); i++){
            String currentCharacter = String.valueOf(fileContent.charAt(i));
            if (currentCharacter.compareTo(openCurlyBrace) == 0){
                // StdOut.println("Pushing");
                myStack.push(openCurlyBrace);
            }
            else if (currentCharacter.compareTo(closedCurlyBrace) == 0){
                if (myStack.size() == 0){
                    return false;
                }
                // StdOut.println("Popping");
                myStack.pop();
            }
        }
        // StdOut.println(myStack.size());
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
        String entireFile = StdIn.readAll();
        System.out.println(isBalanced(entireFile));
    }
}