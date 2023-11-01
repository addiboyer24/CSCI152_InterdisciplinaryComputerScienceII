
public class StringClient{
    public static void main(String[] args) {
        char[] string = {'h', 'i' };
        CustomString myStringDefault = new CustomString(); // calling default constructor.
        CustomString myString = new CustomString(string);
        CustomString myString2 = new CustomString("hi");
        int stringLength = myString2.length();
        StdOut.println(stringLength);
        StdOut.println(myString.length());
    }
}