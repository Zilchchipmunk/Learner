//======================================
//=            Kelvin Blojay           =
//=               CSC1302              =
//=             Home Work 5            =
//======================================
//packages
import java.io.*;
import java.util.*;
//Class creates three objects of the IPod class
//and manipulates its data.
public class PlayMyMusic extends IPod{
   //main method
   public static void main(String args[]){
      
      IPod ipod1 = new IPod();
      IPod ipod2 = new IPod();
      IPod ipod3 = new IPod();
      
      //IPod ipod = new IPod();
      
      System.out.println("Select '1' for power ON/OFF");
      int selection = ipod1.input.nextInt();
      int loopSelection = 0; 
      
      if (selection == 1){
         
            ipod1.setPowerStatus(true);
            while(ipod1.powerStatus == true){
               System.out.println("Ipod Menu");
               System.out.println("---------------------");
               System.out.println("1.ON/OFF");
               System.out.println("2.Volume");
               System.out.println("3.Reguest song");
               System.out.println("4.Choose random song");
               System.out.println("Select 1-4");
               System.out.println("---------------------");
               loopSelection = ipod1.input.nextInt();
               if(loopSelection == 1){
                  System.out.println("Turning system off. Good bye.");
                  System.exit(0);                  
               }
               else if(loopSelection == 2){
                  System.out.println("Enter volume 1-6");
                  ipod2.setVolume(ipod2.input.nextInt());
                  System.out.println("Volume is set to "+ipod2.getVolume());
               }
               
               else if(loopSelection == 3){
                  ipod3.songList();
                  ipod3.displaySongList();
                  System.out.println("Request a song 1-10");
                  int song = ipod3.input.nextInt();
                  System.out.println("You are playing track "+ipod3.songs.get(--song));
                  
               }
               else if(loopSelection == 4 ){
                  ipod1.songList();
                  System.out.println("Choose random song");
                  Random ran = new Random();
                  int randomSong = 1 +ran.nextInt(10);
                  System.out.println("You are playing track "+ipod1.songs.get(randomSong));
                 
               }
               else{
                  System.out.println("Wrong Selection");
               }
            }
            
      }
      else{
         System.out.println("System is OFF. Goodbye");
         
         //code to exit system
         System.exit(0);
      }   
      
   
   }
}