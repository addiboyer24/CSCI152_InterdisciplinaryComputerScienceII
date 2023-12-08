public class Package implements Comparable<Package>{

    private String addressedTo;

    public Package(String addressedTo){
        this.addressedTo = addressedTo;
    }

    // Generically a.compareTo(b); - equal this will return 0.
    // a.compareTo(b) - > 0 if a is greater than b.
    // a.compareTo(b) - < 0 if a is less than b.
    @Override
    public int compareTo(Package o) {
        return this.addressedTo.compareTo(o.getAddressedTo());
    }

    public String getAddressedTo(){
        return this.addressedTo;
    }

    public String toString(){
        return this.addressedTo;
    }
    public static void main(String[] args) {
        // Test client.
        Comparable[] myPackages = {new Package("Oprah Winfrey"), new Package("Michael Jordan"), new Package("Post Malone") };
        Sorting.selectionSort(myPackages);
        assert Sorting.isSorted(myPackages, myPackages.length) : "Something is wrong with selection sort";
        for (int i = 0; i < myPackages.length; i++){
            StdOut.println(myPackages[i]);
        }
    }

}