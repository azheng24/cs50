//Create a program to write Aloha a given amount of times and have exclamation points increase
//Created: Dec 30 2020
public class AlohaLeastToGreatest {

    public static void main(String[] args) {
        int numberOfTimes = Integer.parseInt(args[0]);
        for(int i = 0; i < numberOfTimes; i++) {
            System.out.print("Aloha");
            for(int j = 0; j < i; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}