package driver;

public class Movie_And_Reviews {
	String moviename;
	float rating;
	
	public Movie_And_Reviews() {
		
	}
	
	public Movie_And_Reviews(String moviename, float rating) {
		super();
		this.moviename = moviename;
		this.rating = rating;
	}
	
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie_And_Reviews [moviename=" + moviename + ", rating=" + rating + "]";
	}
	
	

}
