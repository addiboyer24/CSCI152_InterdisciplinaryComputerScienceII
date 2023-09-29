import java.awt.Color;
public class HelloWorldDraw{
    public static void main(String[] args) {
        StdDraw.setXscale(0,10);
        StdDraw.setYscale(0,10);

        StdDraw.setPenColor(Color.blue);
        StdDraw.filledCircle(5, 5, 5);

        StdDraw.setPenColor(Color.white);
        StdDraw.text(5, 5, "Hello World!");
    }
}