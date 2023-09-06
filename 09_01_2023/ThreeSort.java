public class ThreeSort{
    public static void main(String[] args){
        int integer1 = Integer.parseInt(args[0]);
        int integer2 = Integer.parseInt(args[1]);
        int integer3 = Integer.parseInt(args[2]);

        int max = Math.max(integer1, integer2);
        max = Math.max(max, integer3);

        int min = Math.min(integer1, integer2);
        min = Math.min(min, integer3);

        int mid = (((integer1 != min && integer1 != max) ? 1: 0) * integer1)
                + (((integer2 != min && integer2 != max) ? 1: 0) * integer2)
                + (((integer3 != min && integer3 != max) ? 1 : 0) * integer3);

        double r = Math.random(); // Number between 0 and 1.
        int n = 10;
        int randomNumber = (int)(r * n);
        System.out.println(min + " " + mid + " " + max);
        // integer1, integer2, integer3
        // min                 max
    }
}