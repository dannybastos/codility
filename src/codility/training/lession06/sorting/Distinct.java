package codility.training.lession06.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	public static void main(String[] args) {
		int[] A = {2,2,1,2,3,1};
//		int[] A = {};
		int result = solution(A);
		System.out.println(result);
	}

	private static int solution(int[] A) {
		Set<Integer> lst = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			lst.add(A[i]);
		}
		return lst.size();
	}
}
