//
//Created: D
public class BoardCloseness {

    public static void main(String[] args) {
        int xcoordinate = Integer.parseInt(args[0]);
        int ycoordinate = Integer.parseInt(args[1]);
        int smallestNum;
        for (int i = 0; i < ycoordinate; i++) {
            for (int j = 0; j < xcoordinate; j++) {
                smallestNum = i + 1;
                if ((ycoordinate - i) < smallestNum) {
                    smallestNum = ycoordinate - i;
                }
                if (j + 1 < smallestNum) {
                    smallestNum = j + 1;
                }
                if ((xcoordinate - j) < smallestNum) {
                    smallestNum = xcoordinate - j;
                }
                System.out.print(smallestNum + " ");
            }
            System.out.println();
        }
    }
}