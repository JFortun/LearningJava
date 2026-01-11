import java.util.Optional;

class ErrorHandling {

	void handleErrorByThrowingIllegalArgumentException() {
		throw new IllegalArgumentException();
	}

	void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(final String message) {
		throw new IllegalArgumentException(message);
	}

	void handleErrorByThrowingAnyCheckedException() throws Exception {
		throw new Exception();
	}

	void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(final String message) throws Exception {
		throw new Exception(message);
	}

	void handleErrorByThrowingAnyUncheckedException() {
		throw new RuntimeException();
	}

	void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(final String message) {
		throw new RuntimeException(message);
	}

	void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
		throw new CustomCheckedException();
	}

	void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(final String message)
			throws CustomCheckedException {
		throw new CustomCheckedException(message);
	}

	void handleErrorByThrowingCustomUncheckedException() {
		throw new CustomUncheckedException();
	}

	void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(final String message) {
		throw new CustomUncheckedException(message);
	}

	Optional<Integer> handleErrorByReturningOptionalInstance(final String integer) {
		try {
			return Optional.of(Integer.parseInt(integer));
		} catch (final NumberFormatException e) {
			return Optional.empty();
		}
	}

}
