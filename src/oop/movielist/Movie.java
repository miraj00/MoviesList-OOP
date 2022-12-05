package oop.movielist;

public class Movie {
	// fields
		
	public String title;
	public String category;


	public Movie ( String title, String category) {
		this.title = title;
		this.category = category;	
	}
}








/*  ======================================== Requirements ==========================================================================================
 * LIST MOVIES ( OOP - Object Oriented Programming ) 
Classes, Objects
Task: List movies by category.

What will the application do?
The application stores a list of 10 movies and displays them by category.
The user can enter any of the following categories to display the films in the list that match the category: animated, drama, horror, scifi.
After the list is displayed, the user is asked if he or she wants to continue. If not, the program ends.

Build Specifications
Each movie should be represented by an object of type Movie. The Movie class must provide two public fields: title and category. Both of these fields should be Strings. The class should also provide a constructor that accepts a title and category as parameters and uses the values passed to it to initialize its fields.
When the user enters a category, the program should read through all of the movies in the ArrayList and display a line for any movie whose category matches the category entered by the user.
Extended Exercises:
Standardize the category codes by displaying a menu of categories and having the user select the category by number rather than entering the name.
Display the movies for the selected category in alphabetical order.
Get the class MoviesIO from the GC GitHub. This class has a method named getMovie(). Use this method to fill the array list with 100 Movie objects.

Console Preview: 
Welcome to the Movie List Application!

There are 10 movies in this list. 
What category are you interested in? scifi
Star Wars
2001: A Space Odyssey
E.T. The Extra-terrestrial
A Clockwork Orange
Close Encounters of the Third Kind

Continue? (y/n): Y
What category are you interested in? …


 


Grading Criteria
Each movie should be represented by an object of type Movie
(2pts) The Movie class must provide two private fields: title and category and the properties that go with them
(2pts) The class should also provide a constructor that accepts a title and category as parameters and uses the values passed to it to initialize its fields
(2pts) When the user enters a category, the program should read through all of the movies in the List and display a line for any movie whose category matches the category entered by the user
Validate input don’t accept blanks for any of the questions
(2pts) Correct answer in Lab Summary when submitting to the LMS
 */
