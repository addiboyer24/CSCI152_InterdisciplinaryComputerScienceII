public class OrphanedObject{
    public static void main(String[] args) {
        String myString = new String("bye");
        String orphanedString = "hello"; // "hello" is Orphaned :(

        orphanedString = myString;

        StdOut.println(myString + " " + orphanedString);
    }
}