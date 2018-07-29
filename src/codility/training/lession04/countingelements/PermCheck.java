package codility.training.lession04.countingelements;

import java.util.Arrays;

public class PermCheck {
	public static void main(String[] args) {
		int[] A = {4,1,3,2};
		int result = solution(A);
		System.out.println(result);
	}

	private static int solution(int[] A) {
		if (A.length == 0)
			return 1;
		Arrays.sort(A);
		int find = 1;
		for (int i = 0; i < A.length; i++) {
			if (find != A[i])
				return 0;
			find++;
		}
		return 1;
	}
}
