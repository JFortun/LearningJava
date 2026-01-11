import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

	private static final List<Character> LETTERS = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
			'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');

	List<String> printToList(char a) {
		final int introducedLetterIndex = LETTERS.indexOf(a);
		final List<String> result = new ArrayList<>();

		for (int i = 0; i <= introducedLetterIndex; i++) {
			result.add(this.createStringLine(i, introducedLetterIndex));
		}

		final List<String> reversedResult = new ArrayList<>(result.reversed());
		reversedResult.removeFirst();
		result.addAll(reversedResult);
		result.forEach(IO::println);
		return result;
	}

	private String createStringLine(final int currentLetterIndex, final int introducedLetterIndex) {
		final int spacesBetweenLetters = this.calculateSpacesBetweenLetters(currentLetterIndex);
		final int spacesOutsideLetters = this.calculateSpacesOutsideLetters(currentLetterIndex, introducedLetterIndex);
		if (currentLetterIndex == 0 && introducedLetterIndex == 0) {
			return this.formatLine(List.of(LETTERS.get(currentLetterIndex)));
		}
		final List<Character> line = new ArrayList<>(this.spaceWriter(spacesOutsideLetters));
		line.addAll(this.letterWriter(currentLetterIndex, spacesBetweenLetters));
		line.addAll(this.spaceWriter(spacesOutsideLetters));

		return this.formatLine(line);
	}

	private List<Character> spaceWriter(final int amount) {
		final List<Character> result = new ArrayList<>();
		for (int i = 0; i < amount; i++) {
			result.add(' ');
		}
		return result;
	}

	private List<Character> letterWriter(final int currentLetterIndex, final int spacesBetweenLetters) {
		final List<Character> result = new ArrayList<>();
		if (currentLetterIndex == 0) {
			result.add(LETTERS.get(currentLetterIndex));
		}
		if (currentLetterIndex > 0) {
			result.add(LETTERS.get(currentLetterIndex));
			result.addAll(this.spaceWriter(spacesBetweenLetters));
			result.add(LETTERS.get(currentLetterIndex));
		}
		return result;
	}

	private String formatLine(final List<Character> line) {
		final StringBuilder result = new StringBuilder();
		line.forEach(result::append);
		return result.toString();
	}

	private int calculateSpacesBetweenLetters(final int currentLetterIndex) {
		if (currentLetterIndex == 0) {
			IO.println("Spaces between letter A: 0");
			return 0;
		}
		final int result = 2 * currentLetterIndex - 1;
		IO.println("Spaces between letter {1}: {2}".replace("{1}", LETTERS.get(currentLetterIndex).toString())
				.replace("{2}", String.valueOf(result)));
		return result;
	}

	private int calculateSpacesOutsideLetters(final int currentLetterIndex, final int introducedLetterIndex) {
		if (currentLetterIndex == 0 && introducedLetterIndex == 0) {
			IO.println("Spaces outside letter A: 0");
			return 0;
		}
		final int result = introducedLetterIndex - currentLetterIndex;
		IO.println("Spaces outside letter {1}: {2}".replace("{1}", LETTERS.get(currentLetterIndex).toString())
				.replace("{2}", String.valueOf(result)));
		return result;
	}

}
