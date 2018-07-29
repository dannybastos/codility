package codility.training.lession04.countingelements;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int[] A = {3,4,4,6,1,4,4};
		int N = 5;
		int[] result = solution(N, A);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int maxValue = 0;
		int i = 0;
		while (i < A.length) {
			if (A[i] > N) {
				for (int j = 0; j < result.length; j++) {
					result[j] = maxValue;
				}
			} else {
				result[A[i]-1] = result[A[i]-1]+1; 
				if (result[A[i]-1] > maxValue)
					maxValue = result[A[i]-1];
			}
			i++;
		}
		return result;
	}
}
