/*
Author: Mr. Guglielmi
Date: 25/03/2024
Description: A class that contains the skating roster for a hockey team
*/

import java.util.Scanner;
import java.io.*;

public class Roster{

	HockeyPlayer players[];
	Scanner s;
   
	Roster(){									//to simplify for this program:
		players = new HockeyPlayer[18]; //a hockey team will always have 18 skaters on the roster
	   s = new Scanner(System.in);
   }
	
	Roster(String f){
		players = new HockeyPlayer[18];
		loadRoster(f);
	}
	
	//utility method to load players from a file
	private void loadRoster(String filename){
		Scanner s;
		File f;
		try{
			f = new File (filename);
			s = new Scanner(f);
			
			for(int i = 0; i < 18; i++){
				String line = s.nextLine();
				String temp[] = line.split (",");
				//file format: name, goals, assists
				this.players[i] = new HockeyPlayer (temp [0], Integer.parseInt(temp [1]), Integer.parseInt(temp [2])); 
			}
		}
		catch (Exception e){
			System.out.println (e.getMessage());
		}
		
		return;
	}
	
	public void display(){
		//display the roster using the player to string methods
		for (HockeyPlayer i : players){
			System.out.println (i.toString());
		}
		return;
	}
   
	
	//insert assignment methods below this point
   
   public void sortPoints() {
      
   }
   
   public void sortYear() {
   
   }
   
   public void input() {
      String option;
      System.out.println("Please enter the name of the txt file containing the player data: ");
      String fileName = s.nextLine();
      System.out.println("Please enter an option (o for a list of options): ");
      option = s.nextLine();
      if (option.equals("o")) {
         System.out.println("Options: ");
         System.out.println("1. Sort by goals");
         System.out.println("2. Sort by total points");
      }
      else if (option.equals("1")) {
      
      }
      else if (option.equals("2")) {
      
      }
      else {
         System.out.println("Please enter a valid option.");
      }
   }
   

}