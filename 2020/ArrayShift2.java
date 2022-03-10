//
//Created: D
public class ArrayShift2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int temporary;

        for (int i = 0; i < Math.abs(n); i++) {
            if (n > 0) {
                temporary = array[array.length-1];
                for (int j = array.length-1; j > 0; j--) {
                    array[j] = array[j-1];
                }
                array[0] = temporary;
            } else {
                temporary = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j] = array[j-1];
                }
                array[array.length-1] = temporary;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

/*

                if ((i-n) < 0) {
                    if ((array[i-n+array.length]) == array.length-1) {
                        array[i] = temporary;
                    } else {
                        array[i-n+array.length] = array[i];
                    }
                }
                else {
                    array[i] = array[i-n];
                }
                */