import java.io.Serial;

class CustomCheckedException extends Exception {

	@Serial
	private static final long serialVersionUID = 1L;

	public CustomCheckedException() {
		super();
	}

	public CustomCheckedException(final String message) {
		super(message);
	}

}
