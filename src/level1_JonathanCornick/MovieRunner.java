package level1_JonathanCornick;

public class MovieRunner {

	public static void main(String[] args) {
		Movie m = new Movie("The Sixth Sense", 4);// gg
		Movie n = new Movie("Twilight", 2);// gg
		Movie s = new Movie("Star Wars: The Empire Strikes Back", 5);// gg
		Movie b = new Movie("Black Panther", 3);// gg
		Movie d = new Movie("Deadpool", 3);// gg
		System.out.println(m.getTicketPrice());
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(m);
		netflix.addMovie(n);
		netflix.addMovie(s);
		netflix.addMovie(b);
		netflix.addMovie(d);
		netflix.sortMoviesByRating();
		netflix.printMovies();
		System.out.println(netflix.getBestMovie().getTitle());
		System.out.println(netflix.getMovie(1).getTitle());

	}
}