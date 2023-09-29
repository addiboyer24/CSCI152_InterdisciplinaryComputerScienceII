public class Whiteboard{
    public static void main(String[] args) {
        StdDraw.setXscale(0,10);
        StdDraw.setYscale(0,10);
        StdDraw.enableDoubleBuffering();
        while(true){
            if (StdDraw.isMousePressed()){
                StdDraw.clear();
                double x = StdDraw.mouseX();
                double y = StdDraw.mouseY();
                StdDraw.filledCircle(x, y, .5);
                StdDraw.show();
                StdDraw.pause(1);
            }
        }
    }
}