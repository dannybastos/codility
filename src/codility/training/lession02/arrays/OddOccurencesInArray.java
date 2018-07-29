package codility.training.lession02.arrays;

import java.util.Arrays;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		int[] A = {2, 2, 3, 3, 4};
		int result = solution(A);
		System.out.println(String.format("odd : %d", result));
	}

	public static int solution(int[] A) {
		if (A.length == 1)
			return A[0];
		Arrays.sort(A);
		boolean foundOdd = false;
		int i = 0;
		int anterior = 0, posterior = 0;
		while ((i < A.length) && (!foundOdd)) {
			anterior = A[i];
			i++;
			if (i < A.length) {
				posterior = A[i];
				foundOdd = (anterior != posterior);
			} else
				foundOdd = true;
			i++;
		}
		return anterior;
	}
}
