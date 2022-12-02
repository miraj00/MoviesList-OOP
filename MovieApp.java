package oop.movielist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Jurassic Park", "Adventure"));
		movies.add(new Movie("Inception", "Sci-fi"));
		movies.add(new Movie("Captain America", "Adventure"));
		movies.add(new Movie("Black Adam", "Action"));
		movies.add(new Movie("Jurassic Park", "Adventure"));
		movies.add(new Movie("Thor", "Sci-fi"));
		movies.add(new Movie("ROBOCOP", "Action"));
		movies.add(new Movie("The Lost City", "Romantic"));
		movies.add(new Movie("twilight", "Romantic"));
		movies.add(new Movie("Equalizer", "Crime"));
		movies.add(new Movie("Free Guy", "Sci-fi"));
		movies.add(new Movie("Heat", "Crime"));
		movies.add(new Movie("Batman", "Crime"));
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this list. ");
		System.out.println(" Available Categories : Adventure, Sci-fi, Action, Romantic, Crime ");
		
		
		boolean promptingToContinue = true;
		while (promptingToContinue) {
		
			
			System.out.println("What category are you interested in ? :");
			String choice = scnr.next();
			
			for (int i = 0; i < movies.size(); i++  ) {
			// if category matches, Print the name of movie
			
			//	System.out.println(movies.get(i).category);     ------ Test to see cetegories
			//	System.out.println(choice);						------ test to see user entry
			
			if(movies.get(i).category.equalsIgnoreCase(choice)) {
					
				System.out.println(movies.get(i).title); 
				}	
			}	
			
			System.out.println("");
			System.out.println("Continue ? (y/n)");
			System.out.print("Your selection: ");
			String userContinues = scnr2.nextLine();
			
			
			if (userContinues.equalsIgnoreCase("y")) {
				promptingToContinue = true;				
			
			} else if (userContinues.equalsIgnoreCase("n")) {
				promptingToContinue = false;				
			
			} else {
				System.out.println();
				System.out.println("Sorry, I didn't understand that response. Please try again.");
			}				
		}
				
		scnr.close();	
	}

}
