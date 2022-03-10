//
//Created: D
public class FactorialWithLoop {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int quotient = 1;
        for (int i = 1; i <= n; i++) {
            quotient = i * quotient;
        }
        System.out.println(quotient);
    }
}