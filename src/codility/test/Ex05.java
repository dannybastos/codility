package codility.test;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * 
 * @author dannybastos
 * @description Password validation
 */
public class Ex05 {
	public static void main(String[] args) {
		String S = "asfdasfBBsads9asidjebAkjsdas";
		int result = solution(S);
		System.out.println(result);
	}

	private static int solution(String S) {
		if (S.length() > 200)
			return -1;
		
		String[] arrStr = S.split("[0-9]");
		String str = arrStr[arrStr.length-1];
		Optional<String> opt = Stream.of(str)
				.filter(s -> s.chars().anyMatch(Character::isUpperCase))
				.findFirst();

		if (opt.isPresent())
			return opt.get().length();
		else
			return -1;
	}
}
