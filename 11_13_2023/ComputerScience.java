public class ComputerScience extends Department{
    private int availableComputers;

    public ComputerScience(String name, String building, long numberOfStudents, int availableComputers){
        super(name, building, numberOfStudents);
        this.availableComputers = availableComputers;
    }

    // Instance method.
    public static void main(String[] args) {
        ComputerScience cs = new ComputerScience("Computer Science", "Social Science", 150, 200);
        cs.setAvailableComputers(-10);
    }

    // Getter.
    public int getAvailableComputers(){
        return this.availableComputers;
    }

    // Setter.
    public void setAvailableComputers(int numberOfAvailableComputers){
        if (numberOfAvailableComputers < 0){
            throw new IllegalArgumentException("Exception thrown");
        }
        assert numberOfAvailableComputers > 0 : "Assertion failed";

        this.availableComputers = numberOfAvailableComputers;
    }
}