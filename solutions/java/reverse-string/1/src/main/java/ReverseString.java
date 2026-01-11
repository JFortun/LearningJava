class ReverseString {

    String reverse(String inputString) {
        final var inputStringCharArray = inputString.toCharArray();
		var inputStringCharArrayReverse = "";
		for (int i = inputStringCharArray.length - 1; i >= 0; i--) {
			final var character = String.valueOf(inputStringCharArray[i]);
			inputStringCharArrayReverse = inputStringCharArrayReverse.concat(character);
		}
		return inputStringCharArrayReverse;
    }
  
}
