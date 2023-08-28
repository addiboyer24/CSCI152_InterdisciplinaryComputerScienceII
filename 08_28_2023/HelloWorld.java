public class HelloWorld {

    // Main method signature, this will be the same for all your programs* i.e. this is the entry point to the application.
    public static void main(String[] args){
        System.out.println("Hello World!");
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
