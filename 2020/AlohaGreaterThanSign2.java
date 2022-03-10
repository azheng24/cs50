//Create a program to write Aloha a given amount of times and have exclamation points increase
//Created: Dec 30 2020
public class AlohaGreaterThanSign2 {

    public static void main(String[] args) {
        int numberOfTimes = Integer.parseInt(args[0]);
        for(int i = numberOfTimes; i > numberOfTimes/2; i--) {
            System.out.print("Aloha");
            for(int j = numberOfTimes; i < j; j--) {
                System.out.print("!");
            }
            System.out.println();
        }
        for(int i = numberOfTimes/2; i > 0; i--) {
            System.out.print("Aloha");
            for(int j = 0; i-1 > j; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}