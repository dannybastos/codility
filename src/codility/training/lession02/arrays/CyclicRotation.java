package codility.training.lession02.arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		int K = 3;
		int[] B = solution(A, K);
		System.out.println(Arrays.toString(B));		
	}
	
	public static int[] solution(int[] A, int K) {
		for (int j=0; j < K; j++) {
			if (A.length == 0)
				return A;
			int i = A.length-1;
			int ultimo = A[i];
			while (i > 0) {
				A[i] = A[i-1];			
				i--;
			}
			A[i] = ultimo;
		}
		return A;
	}
	
}
