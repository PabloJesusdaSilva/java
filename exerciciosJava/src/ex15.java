public class ex15 {
   public static void main (String[] args) {
      int i = 0;
      int sume = 0;

      while(i <= 10) {
         sume += i;
         i++;

         System.out.print("The value is: " + i);
      }

      System.out.print("The sum of the first ten numbesr is: " + sume);
   }
}
