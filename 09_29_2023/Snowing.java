public class Snowing {
        public static void main(String[] args) {

            double x1 = 0.0;
            double y1 = 0.1;
            double x2 = 0.0;
            double y2 = 0.4;
            double x3 = 0.0;
            double y3 = 0.2;
            double x4 = 0.0;
            double y4 = 0.3;
            double x5 = 0.0;
            double y5 = 0.5;

            while(true) {
                StdDraw.enableDoubleBuffering();

                StdDraw.setPenRadius(0.3);
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.clear(StdDraw.CYAN);
                StdDraw.point(0.5, 0.7);
                StdDraw.point(0.5, 0.6);
                StdDraw.point(0.3, 0.6);
                StdDraw.point(0.7, 0.6);
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.text(0.5,0.6,"press mouse for snow");

                if(StdDraw.isMousePressed()){
                    StdDraw.clear(StdDraw.DARK_GRAY);
                    StdDraw.setPenRadius(0.3);
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.point(0.5, 0.7);
                    StdDraw.point(0.5, 0.6);
                    StdDraw.point(0.3, 0.6);
                    StdDraw.point(0.7, 0.6);

                    StdDraw.setPenRadius(0.05);
                    StdDraw.setPenColor(StdDraw.WHITE);

                    if (y1 > 0.0){
                        y1 -= 0.05;
                    } else {
                        y1 = 0.45;
                        x1 = 0.3 + Math.random() * 0.4;
                    }
                    StdDraw.point(x1, y1);
                    if (y2 > 0.0){
                        y2 -= 0.05;
                    } else {
                        y2 = 0.45;
                        x2 = 0.3 + Math.random() * 0.4;
                    }
                    StdDraw.point(x2, y2);
                    if (y3 > 0.0){
                        y3 -= 0.05;
                    } else {
                        y3 = 0.45;
                        x3 = 0.3 + Math.random() * 0.4;
                    }
                    StdDraw.point(x3, y3);
                    if (y4 > 0.0){
                        y4 -= 0.05;
                    } else {
                        y4 = 0.45;
                        x4 = 0.3 + Math.random() * 0.4;
                    }
                    StdDraw.point(x4, y4);
                    if (y5 > 0.0){
                        y5 -= 0.05;
                    } else {
                        y5 = 0.45;
                        x5 = 0.3 + Math.random() * 0.4;
                    }
                    StdDraw.point(x5, y5);
                }
                StdDraw.show();
                StdDraw.pause(20);
            }
        }
    }
