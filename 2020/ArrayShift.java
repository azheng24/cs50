//
//Created: D
public class ArrayShift {
    public static void main(String[] args) {
        int amountToShift = Integer.parseInt(args[0]);
        int sizeOfArray = Integer.parseInt(args[1]);

        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int temporary;
        for (int i = 0; i < Math.abs(amountToShift); i++) {
            if (amountToShift > 0) {
                temporary = array[array.length-1];
                for (int j = array.length-1; j > 0; j--) {
                    array[j] = array[j-1];
                }
                array[0] = temporary;
            } else {
                temporary = array[0];
                for (int j = 0; j < array.length-1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length-1] = temporary;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}