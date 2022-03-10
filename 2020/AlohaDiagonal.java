//Create a program to write Aloha a given amount of times and have exclamation points increase
//Created: Dec 30 2020
public class AlohaDiagonal {

    public static void main(String[] args) {
        int numberOfTimes = Integer.parseInt(args[0]);
        for(int i = numberOfTimes; i > 0; i--) {
            for(int j = 0; i-1 > j; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}