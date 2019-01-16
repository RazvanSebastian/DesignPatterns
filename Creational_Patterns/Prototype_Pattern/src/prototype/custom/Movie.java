package prototype.custom;

public class Movie extends Item {

	private String runtime;

	public Movie() {
	}

	public Movie copy(Movie originalCopy) {
		Movie movie = new Movie();
		movie.runtime = originalCopy.runtime;
		movie.setAuthor(new Author());
		movie.setTitle(originalCopy.getTitle());
		movie.setPrice(originalCopy.getPrice());
		movie.setUrl(originalCopy.getUrl());
		return movie;
	}

	/* Deep copy */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Movie clonedMovie = (Movie) super.clone();
		clonedMovie.setAuthor((Author) super.getAuthor().clone());
		return clonedMovie;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

}
