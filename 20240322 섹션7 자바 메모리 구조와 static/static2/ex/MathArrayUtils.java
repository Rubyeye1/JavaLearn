package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        int tempSum = 0;
       for (int i=0; i < values.length; i++) {
            tempSum += values[i];
       }
       return tempSum;
    }
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    public static int min(int[] values) {
        int tempMin = values[0];
        for (int i=0; i < values.length; i++) {
            if (values[i] < tempMin) {
                tempMin = values[i];
            }
        }
        return tempMin;
    }
    public static int max(int[] values) {
        int tempMax = values[0];
        for (int i=0; i < values.length; i++) {
            if (values[i] > tempMax){
                tempMax = values[i];
            }
        }
        return tempMax;
    }

}
