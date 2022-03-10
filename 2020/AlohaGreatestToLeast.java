//Create a program to write Aloha a given amount of times and have exclamation points decrease
//Created: Dec 30 2020
public class AlohaGreatestToLeast {

    public static void main(String[] args) {
        int numberOfTimes = Integer.parseInt(args[0]);
        int k;
        for(int i = 0; i <= numberOfTimes; i++) {
            System.out.print("Aloha");
            if (i < numberOfTimes/2) {
                k = i;
            } else {
                k = numberOfTimes - i;
            }
            for(int j = 0; j <= k; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}