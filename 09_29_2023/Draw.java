public class Draw{
    public static void main(String[] args) {
        StdDraw.setXscale(0,10);
        StdDraw.setYscale(0,10);
        StdDraw.setPenRadius(0.01);
        StdDraw.enableDoubleBuffering();

        Color[] myColors = { Color.blue, Color.red, Color.yellow, Color.orange };

        while (!StdIn.isEmpty()){
            StdDraw.clear();
            int x = StdIn.readInt();
            int y = StdIn.readInt();
            StdDraw.point(x,y);
            StdDraw.pause();
        }
    }
}