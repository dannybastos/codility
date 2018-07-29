package codility.test;

import java.util.Arrays;

/**
 * 
 * @description Can sort array with one move
 * @author dannybastos
 *
 */
public class Ex07 {
	private static final int[] A = { 1, 3, 5, 3, 3 };

	public static void main(String[] args) {
		boolean result = solution(A);
		System.out.println(String.format("Result:%s", result));
	}

	private static boolean solution(int[] A) {

		if (A.length > 100)
			return false;

		int[] sortedArr = Arrays.copyOf(A, A.length);
		Arrays.sort(sortedArr);

		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != sortedArr[i])
				count++;
		}
		return (count <= 2);
	}
}
