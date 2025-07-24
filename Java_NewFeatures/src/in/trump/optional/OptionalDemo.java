package in.trump.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] words = new String[10];
		
		Optional<String> nullCheck = Optional.ofNullable(words[5]);
		
		if(nullCheck.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		} else {
			System.out.println("word is null");
		}

	}

}
