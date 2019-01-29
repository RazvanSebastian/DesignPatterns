package bridge;

import java.util.ArrayList;

import java.util.List;

public class MoviePrinter extends Printer {

	private Movie instance;

	public MoviePrinter(Movie instance) {
		this.instance = instance;
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		details.add(new Detail("Title1", instance.getTitle()));
		details.add(new Detail("Year", instance.getYear()));
		details.add(new Detail("Runtime", instance.getRuntime()));

		return details;
	}

	@Override
	protected String getHeader() {
		return instance.getClassification();
	}

}
