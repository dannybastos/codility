package codility.training.lession05.prefixsums;

import java.util.Arrays;

public class GeometricRangeQuery {

	public static void main(String[] args) {
		String S = "CAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTACAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,1273};
		int[] result = solution(S, P, Q);
		System.out.println(String.format("Esperado: [2,4,1] encontrado : %s", Arrays.toString(result)));
	}

	public static int[] solution(String S, int[] P, int[] Q) {
		int M = P.length; 
		int[] result = new int[M];
		for (int K = 0; K < M; K++) {
			int from = P[K];
			int to = Q[K];
			
			String selectedDNA = S.substring(from, to+1);
			int factor = 4;
			if (selectedDNA.contains("A")) {
				factor = 1;				
			} else {
				if (selectedDNA.contains("C"))
					factor = 2;
				else
					if (selectedDNA.contains("G"))
						factor = 3;
			}
			result[K] = factor;
		}
		return result;
	}
}