
public class Practice {
    /** x is an array of n integers.
 * n is a positive integer.
 */
public static int recur(int[] x, int n)
{
   int t;
   if (n == 1)
      return x[0];
   else
   {
      t = recur(x, n - 1);
      if (x[n-1] > t)
         return x[n-1];
      else
         return t;
   }
}

    public static void main(String[] args) {
        int[] test = new int[] { 3, 5, 2, 6, 8, 4, 1, 12, 9 };
        int result = recur(test, 5);
        System.out.println(result);
    }
}
