import java.io.Serial;

class CustomUncheckedException extends RuntimeException {
    
	@Serial
	private static final long serialVersionUID = 2L;

	public CustomUncheckedException() {
		super();
	}

	public CustomUncheckedException(final String message) {
		super(message);
	}

}
