/*
Author: Mr. Guglielmi
Date: 25/03/2024
Description: A class that contains the skating roster for a hockey team
*/

import java.util.Scanner;
import java.io.*;

public class Roster{

	HockeyPlayer players[];


	Roster(){                                    //to simplify for this program:
		players = new HockeyPlayer[18]; //a hockey team will always have 18 skaters on the roster

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
		} catch (Exception e){
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
	   int index = 0;
	   while (index < 18) {
		   if (index == 0)
			   index++;
		   if (players[index].getPoints() >= players[index - 1].getPoints())
			   index++;
		   else {
			   HockeyPlayer temp = players[index];
			   players[index] = players[index - 1];
			   players[index - 1] = temp;
			   index--;
		   }
	   }
   }
   
   public void sortGoals() {
	   int index = 0;
	   while (index < 18) {
		   if (index == 0)
			   index++;
		   if (players[index].getGoals() >= players[index - 1].getGoals())
			   index++;
		   else {
			   HockeyPlayer temp = players[index];
			   players[index] = players[index - 1];
			   players[index - 1] = temp;
			   index--;
		   }
	   }
   }
   

}