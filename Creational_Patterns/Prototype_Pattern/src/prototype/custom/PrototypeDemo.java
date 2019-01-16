package prototype.custom;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();

		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Java Creational Patterns ");
		System.out.println(movie);
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		System.out.println(movie.getRuntime());

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");

		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getUrl());

		System.out.println();
		System.out.println("Deep copy of author test");
		System.out.println(movie.getAuthor() + "==" + anotherMovie.getAuthor());
	}

}
