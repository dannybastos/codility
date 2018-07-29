package codility.training.lession03.timecomplexity;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {2,3,5,1};
		int result = solution(A);
		System.out.println(result);
	}
	
	public static int solution(int[] A) {
		if (A.length == 0)
			return 1;
		Arrays.sort(A);
		int find = 1;
		for (int i = 0; i < A.length; i++) {
			if (find != A[i])
				return find;
			find++;
		}
		return find;
	}
}
