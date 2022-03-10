//
//Created: D
import java.util.Random;

public class PickNumber {

    public static void main(String[] args) {
        double[] array = new double[100];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int numberToSwitch = rand.nextInt(100) + 1;
        int numberSwitching = rand.nextInt(100) + 1;

        for(int i = 0; i < array.length; i++) {
            if (numberToSwitch == i) {
                array[i-1] = numberSwitching;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("numberToSwitch " + numberToSwitch);
        System.out.println("numberSwitching " + numberSwitching);
    }
}
