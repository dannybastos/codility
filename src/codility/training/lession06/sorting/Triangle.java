package codility.training.lession06.sorting;

public class Triangle {

	public static void main(String[] args) {
		int[] A = {10,2,5,1,8,20};
		int result = solution(A);
		System.out.println(String.format("expected:1 result: %d", result));
		
	}
	public static int solution(int[] A) {
		for (int p = 0; p < A.length; p++) {
			for (int q = p+1; q < A.length; q++) {
				for (int r = q+1; r < A.length; r++) {
					if (((A[p] + A[q]) > A[r]) &&
					   ((A[q] + A[r]) > A[p]) &&
					   ((A[r] + A[p]) > A[q])) 
						return 1;
				}
			}
		}
		return 0;
	}

}
