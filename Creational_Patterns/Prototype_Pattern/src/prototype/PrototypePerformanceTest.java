package prototype;

import prototype.custom.Author;
import prototype.custom.Movie;
import prototype.custom.Registry;

public class PrototypePerformanceTest {

	public static void main(String... strings) {
		long timeBefore = 0;
		long timeAfter = 0;
		int n = 10000000;

		timeBefore = System.currentTimeMillis();
		Registry registry = new Registry();
		for (int i = 0; i <= n; i++) {
			registry.createItem("Movie");
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("Result of clone = " + (timeAfter - timeBefore));

		timeBefore = System.currentTimeMillis();
		Movie originalMovieObject = new Movie();
		originalMovieObject.setAuthor(new Author());
		originalMovieObject.setTitle("Title");
		originalMovieObject.setRuntime("2 h");
		originalMovieObject.setPrice(19.9);
		originalMovieObject.setUrl("");
		for (int i = 0; i <= n; i++) {
			originalMovieObject.copy(originalMovieObject);
		}
		

		timeAfter = System.currentTimeMillis();
		System.out.println("Result of constructor copy = " + (timeAfter - timeBefore));
	}
}
