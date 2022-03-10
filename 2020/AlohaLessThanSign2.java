//Create a program to write Aloha a given amount of times and have exclamation points decrease
//Created: Dec 30 2020
public class AlohaLessThanSign2 {

    public static void main(String[] args) {
        int numberOfTimes = Integer.parseInt(args[0]);
        int k;
        for(int i = numberOfTimes; i >= 0; i--) {
            System.out.print("Aloha");
            if (i > numberOfTimes/2) {
                k = i-(numberOfTimes/2);
            } else {
                k = numberOfTimes - (numberOfTimes/2) - i;
            }
            for(int j = 0; j <= k; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}