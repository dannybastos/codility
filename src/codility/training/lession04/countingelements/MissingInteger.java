package codility.training.lession04.countingelements;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		int result = solution(A);
		System.out.println(result);
	}

	private static int solution(int[] A) {
		Set<Integer> lst = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			lst.add(A[i]);
		}
		int i = 1;
		while (lst.contains(i)) {
			i++;
		}
		return i;
	}
}
