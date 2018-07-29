package codility.training.lession04.countingelements;

import java.util.HashSet;

public class FrogRiverOne {
	public static void main(String[] args) {
		int X = 5;
		int[] A = {1,3,1,4,2,3,5,4};
		int result = solution(X, A);
		System.out.println(result);
	}

	private static int solution(int X, int[] A) {
		HashSet<Integer> leaf = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X)
				leaf.add(A[i]);
			if (leaf.size() == X)
				return i;
		}
		return -1;
	}
}
