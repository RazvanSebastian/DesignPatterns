package bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("Terminator 2");
		movie.setRuntime("20:45");
		movie.setYear("2019");
		
		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);
		
		String printedMovie = moviePrinter.print(printFormatter);
		System.out.println(printedMovie);
	}

}
