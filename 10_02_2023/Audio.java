public class Audio{
    public static void main(String[] args) {
        double hertzA = 440;
        double sampleRate = StdAudio.SAMPLE_RATE;

        double duration = 2;

        int numberOfSamples = (int) (sampleRate * duration);

        double[] a = new double[numberOfSamples + 1];
        for (int i = 0; i <= numberOfSamples; i++){
            a[i] = Math.sin(2 * Math.PI * i * hertzA / StdAudio.SAMPLE_RATE);
        }

        StdAudio.save("a.wav", a);
    }
}