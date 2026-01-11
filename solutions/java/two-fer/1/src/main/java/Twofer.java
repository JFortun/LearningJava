import static java.util.Objects.isNull;

public class Twofer {
	public String twofer(String name) {
		final var template = "One for you, one for me.";
		return isNull(name) ? template : template.replace("you", name);
	}
}
