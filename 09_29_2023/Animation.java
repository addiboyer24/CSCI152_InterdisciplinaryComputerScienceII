public class Animation{
    public static void main(String[] args) {
        int canvasWidth = 400;
        int canvasHeight = 400;
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        double yMax = 200;
        double xMax = 200;

        StdDraw.setXscale(0, xMax);
        StdDraw.setYscale(0, yMax);
        int secondsRemaining = 15;
        StdDraw.enableDoubleBuffering();
        while(secondsRemaining >= 0){
            StdDraw.clear();

            StdDraw.text(xMax*.10, 10, "Time: " + secondsRemaining);
            StdDraw.show();
            StdDraw.pause(1000);
            secondsRemaining -= 1;
        }

    }
}