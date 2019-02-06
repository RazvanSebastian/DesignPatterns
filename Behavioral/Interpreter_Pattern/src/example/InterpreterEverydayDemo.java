package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {

	public static void main(String... strings) {
		// Sentence
		String input = "Lion, and tigers, and bears! Oh, my!";

		// Grammar
		Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|Lion)");

		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			// Regular expression
			System.out.println("Found a " + matcher.group() + ".");
		}
	}
}
