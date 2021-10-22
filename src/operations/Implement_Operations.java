package operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import driver.Movie_And_Reviews;

public class Implement_Operations implements Imp_MovieReview {
    Scanner sc = new Scanner(System.in);
    ArrayList<Movie_And_Reviews> mr = new ArrayList<Movie_And_Reviews>();
	@Override
	public void addMovieReview() {
		System.out.println("Enter Movie Name and it's Rating");
		Movie_And_Reviews mar = new Movie_And_Reviews(sc.next(),sc.nextFloat());
		mr.add(mar);
		
	}
	@Override
	public void displayMovieAndReview() {
		for(Movie_And_Reviews m : mr) {
			System.out.println(m);
		}
		
	}
	@Override
	public void showHigestReatingMovie() {
		
		ArrayList<Float> ratinglist = new ArrayList<Float>(); 
		for(Movie_And_Reviews m : mr) {
			 ratinglist.add(m.getRating());
			
		}
		//System.out.println("Higest Rating of Movie :"+Collections.max(ratinglist));
		for(Movie_And_Reviews m : mr) {
			 if(m.getRating() ==Collections.max(ratinglist) ) {
				 System.out.println("Movie Name And Its Rating : " +m.getMoviename() +"  "+m.getRating());
			 }
			
		}
		
		//Collections.sort(ratinglist);
		//System.out.println("Following are the Rating of movies: "+ ratinglist);
	
	}

}
