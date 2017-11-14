import java.util.Scanner;
public class Triangles {
   public static void main(String[] args) {
      Scanner S = new Scanner(System.in);
      System.out.print("Enter the double number for side a, side b, side c ");
      double a = S.nextDouble();
      double b = S.nextDouble();
      double c = S.nextDouble();
      double alpha = angle(a, b, c);
      double beta = angle(b, a, c);
      double gamma = angle(c, b, a);
      System.out.printf("Value of the angles with 2 digits after decimal point %.2f %.2f %.2f", alpha, beta, gamma);
   }
   private static double angle(double a, double b, double c) {
      return Math.acos((b * b + c * c - a * a) / (2 * b * c) );
   }
}
   