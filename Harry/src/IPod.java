//======================================
//=            Kelvin Blojay           =
//=               CSC1302              =
//=             Home Work 5            =
//======================================
//packages
import java.util.*;
import java.io.*;
//Class 
public class IPod{
   //Variable declaration
   List songs = new ArrayList();
   Scanner input = new Scanner(System.in);
   int volume = 0;
   boolean powerStatus = false;
   double batteryLife = 1.00;
   String selectedSong = "";
   
    //Constructor
   public IPod()
   {
       

   }
   
   //main method to test class  
   public static void main(String args[]){
      
      
   
   }//main method ends.
   //method add default songs to list.
   public void songList(){
      songs.add("1: Heavenly body by Llyod");
      songs.add("2: Questions Chris Brown");
      songs.add("3: privacy by Chris Brown");
      songs.add("4: savage by Tank");
      songs.add("5: El Chapo by D'banj");
      songs.add("6: Argument by Phyno");
      songs.add("7: If by Davido");
      songs.add("8: Afro Girl by Dotman");
      songs.add("9. Girlfriend by Busta Rhymes");
      songs.add("10. So Excited by Fat Joe");
   }//songList method ends
   //method displays list of songs.
   public void displaySongList()
   {
      for(int i = 0; i < songs.size(); i++)
      {
         System.out.println(songs.get(i));
      }
   }//displaySongList method ends
   public void power(){
      
   }

   //get methods for attributes/variables
   public int getVolume(){
      return volume;
   }
   public boolean getPowerStatus(){
      return powerStatus;
   }
   public double getBatterLife(){
      return batteryLife;
   }
   public String getSelectedSong(){
      return selectedSong;
   }
   //set methods for attributes/variables
   public void setVolume(int value){
      volume = value;
   }
   public void setPowerStatus(boolean value){
      powerStatus = value;
   }
   public void setBatteryLife(double value){
      batteryLife = value;
   }
   public void setSelectedSong(String value){
      selectedSong = value;
   }
   
}