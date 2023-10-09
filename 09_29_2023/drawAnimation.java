import java.awt.Color;

public class drawAnimation{
    public static void main(String[] args){

        //This is for the extra credit it will play at the begining for 6 seconds before the animation starts.
        //It will play 3 different frequencies all for 2 seconds each

        StdDraw.setCanvasSize(400, 400);
        StdDraw.enableDoubleBuffering();

        double hertzA = 440;
        double hertzB = 350;
        double hertzC = 250;

        double sampleRate = StdAudio.SAMPLE_RATE;

        double duration = 2;

        int numberOfSamples = (int) (sampleRate * duration);

        double[] a = new double[numberOfSamples + 1];
        for (int i = 0; i <= numberOfSamples; i++){
            a[i] = Math.sin(2* Math.PI * i * hertzA / StdAudio.SAMPLE_RATE);
        }
        StdAudio.play(a);
        
        double[] b = new double[numberOfSamples + 1];
        for (int i = 0; i <= numberOfSamples; i++){
            b[i] = Math.sin(2* Math.PI * i * hertzB / StdAudio.SAMPLE_RATE);
        }
        StdAudio.play(b);

        double[] c = new double[numberOfSamples + 1];
        for (int i = 0; i <= numberOfSamples; i++){
            c[i] = Math.sin(2* Math.PI * i * hertzC / StdAudio.SAMPLE_RATE);
        }
        StdAudio.play(c);

        
        //This while loop will display the animation until the user decides to quit. 
        while (true) {
            StdDraw.clear();
            StdDraw.picture(0.5, 0.2, "mandrill.jpg");
            
            // Display our text
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.text(0.5, 0.1, "Click with your mouse for Interactive Animation!!");
            StdDraw.text(0.5, 0.05, "Three shapes will be displayed above the monkey!");

            // If the user uses their mouse the three shapes will display as well as a circle that is tracked with the mouse as its coordinates.
            if (StdDraw.isMousePressed()) {
                double mouseX = StdDraw.mouseX();
                double mouseY = StdDraw.mouseY();
                StdDraw.setPenColor(StdDraw.YELLOW);
                StdDraw.filledCircle(mouseX, mouseY, 0.03);

                // Draws a circle that will display when the user presses their mouse
                StdDraw.setPenColor(Color.RED);
                StdDraw.filledCircle(0.1, 0.9, 0.1);
                

                // Draws a rectangle that will display when the user presses their mouse
                StdDraw.setPenColor(Color.BLUE);
                StdDraw.filledRectangle(0.4, 0.9, 0.1, 0.2);
                
            
                // Draws an ellipse that will display when the user presses their mouse
                StdDraw.setPenColor(Color.GREEN);
                StdDraw.filledEllipse(0.8, 0.9, 0.2, 0.1);
                
            }

            StdDraw.show();

            // Pauses the drawing for a moment
            StdDraw.pause(100);
        }
    }
}






    
   

        
        



    