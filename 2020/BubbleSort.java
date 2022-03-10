//
//Created: D
public class BubbleSort {

    public static void main(String[] args) {
        int sizeOfArray = Integer.parseInt(args[0]);
        double[] array = new double[sizeOfArray];
        double temporary;
        boolean done = false;

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        System.out.println();

        while(done == false) {
            done = true;
            for (int i = 0; i < sizeOfArray-1; i++) {
                if(array[i+1] < array[i]) {
                    temporary = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temporary;
                    done = false;
                }
            }
        }

        for(int i = 0; i < sizeOfArray; i++) {
            System.out.println(array[i]);
        }

    }
}