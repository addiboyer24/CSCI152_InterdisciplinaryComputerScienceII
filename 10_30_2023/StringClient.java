
public class StringClient{
    public static void main(String[] args) {
        /*char[] string = {'h', 'i' };
        CustomString myStringDefault = new CustomString(); // calling default constructor.
        CustomString myString = new CustomString(string);*/
        CustomString myStringFromString = new CustomString("hi");
        CustomString sameString = myStringFromString.substring(0, 2);
        CustomString shorterString = myStringFromString.substring(0, 1);

        StdOut.printf("Before: %d , After: %d", myStringFromString.length(), sameString.length());
        StdOut.printf("Before: %d , After: %d", myStringFromString.length(), shorterString.length());

        // modifying object being referenced.
        /*System.out.println(myString.charAt(0));
        string[0] = 'i';
        string[1] = 'h';
        System.out.println(myString.charAt(0));*/
    }
}