public class Client{
    public static void main(String[] args) {
        // Traditional method i.e. not static.
        Random myRandom = new Random();
        System.out.println(myRandom.GetRandom());

        // Static method.
        Random.GetRandom(10);
    }
}