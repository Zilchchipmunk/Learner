package Ipod;

import java.io.*;
import java.util.*;
public class BakeCookiesExtraaCredit {
   
   /* Your program should be generic such that 
   given a number of cookies you can determine
   the number of batches and total time required
   as commented below.
   */
    
   
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Prompt the user for total number of cookies
      System.out.println("Enter total number of cookies");
      double numberOfCookies = input.nextDouble();
      double batches = numberOfCookies/10;
      //1. Display the amount needed for each ingredient
      //cups of flour
      //number of eggs
      //cups of sugar
      //cups of butter
      //pounds of chocolate chips
      
      ingredient(numberOfCookies);
      System.out.println("--------------------------------");
      makeBatter();
      //Making batter takes 10 minutes
      
      //2. Display the number of batches required for baking
      
      //bake cookies in batches of 10
     
      //needs to be calculated based on number of cookies
      System.out.println("Number of batches "+ batches);
      System.out.println("--------------------------------");

      bakeCookies(batches);
      
      //3. Display the total time required to bake cookies
      System.out.println("Total time required for baking is "+ batches*10);
      
      frostCookies();
      //Frosting cookies takes 10 minutes
      
      //4. Display the total time required in this process
      System.out.println("Total time required for frosting is " +batches*10);
   }//main method ends
   public static void ingredient(double value)
   {
      System.out.println(value/5+" cup(s) of flour");
      System.out.println(value/20+" cup(s) of butter");
      System.out.println(value/20+" cup(s) of sugar");
      System.out.println(value/10+" egg(s)");
      System.out.println(value/0.5+" pounds of chocolate chips...");
   }
   
   public static void makeBatter(){
      // Prepare cookie batter
      System.out.println("Mix the dry ingredients.");
      System.out.println("Cream the butter and sugar.");
      System.out.println("Beat in the eggs.");
      System.out.println("Stir in the dry ingredients.");
      System.out.println("Set the oven temperature.");
      System.out.println("--------------------------------");
   
   }
   
   public static void bakeCookies(double batches){
      // Bake the cookies
      while(batches>0){
         System.out.println("Set the timer.");
         System.out.println("Place a batch of cookies into the oven.");
         System.out.println("Allow the cookies to bake.");
         System.out.println("Remove batch of cookies from oven.");
         System.out.println("--------------------------------");
         batches--;
      }
   }
   
   public static void frostCookies(){
      // Frost the cookies
      System.out.println("Mix ingredients for frosting.");
      System.out.println("Spread frosting and sprinkles.");
   }
   
}
