package codility.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dannybastos
 * @description Found qtde equilibrium points
 */
public class Ex02 {
	public static void main(String[] args) {
		int[][] A = new int[5][3];
//		A[0][0] = 1;	A[0][1] = 0;	A[0][2] = 0;	A[0][3] = 0;
//		A[1][0] = 1;	A[1][1] = 1;	A[1][2] = 1;	A[1][3] = 2;
//		A[2][0] = 0;	A[2][1] = 0;	A[2][2] = 0;	A[2][3] = 1;
		
		A[0][0] = 2; 	A[0][1] = 7;	A[0][2] = 5;
		A[1][0] = 3; 	A[1][1] = 1;	A[1][2] = 1;
		A[2][0] = 2; 	A[2][1] = 1;	A[2][2] = -7;
		A[3][0] = 0; 	A[3][1] = 2;	A[3][2] = 1;
		A[4][0] = 1; 	A[4][1] = 6;	A[4][2] = 8;
		int result = solution(A);
		System.out.println(result);
	}

	private static int solution(int[][] A) {
		int[] sumLines = new int[A.length];
		int[] sumCols = new int[A[0].length];
		List<Integer> lstLinesPE = new ArrayList<>();
		List<Integer> lstColsPE = new ArrayList<>();
		
		//sum of lines
		int qtdePE = 0;
		for (int i = 0; i < sumLines.length; i++) {
			for (int j = 0; j < sumCols.length; j++) {
				sumLines[i]+=A[i][j];
			}
		}
		//sum of cols
		for (int j = 0; j < sumCols.length; j++) {
			for (int i = 0; i < sumLines.length; i++) {
				sumCols[j]+=A[i][j];
			}
		}
		
		// finding Eq points in lines
		int idx = 0;
		while (idx < sumLines.length) { 
			int sumUp = 0;
			int somaDown = 0;
			for (int i = 0; i < idx; i++) {
				sumUp += sumLines[i];
			}
			int idxInf = idx+1;
			for (int i = idxInf; i < sumLines.length; i++) {
				somaDown += sumLines[i];
			}
			if (sumUp == somaDown)
				lstLinesPE.add(idx);
			idx++;
			System.out.println(String.format("idx:%d sumUp:%d  sumDown:%d foundEq:%s",idx, sumUp, somaDown, sumUp == somaDown));
		}
		
		// finding eq points in cols
		int idy = 0;
		while (idy < sumCols.length) { 
			int sumLeft = 0;
			int sumRight = 0;
			for (int i = 0; i < idy; i++) {
				sumLeft += sumCols[i];
			}
			int idxEsq = idy+1;
			for (int i = idxEsq; i < sumCols.length; i++) {
				sumRight += sumCols[i];
			}
			if (sumLeft == sumRight)
				lstColsPE.add(idy);
			idy++;
			System.out.println(String.format("idy:%d sumLeft:%d  sumRight:%d foundEq:%s",idy, sumLeft, sumRight, sumLeft == sumRight));
		}

		// found any eq point
		if ((lstLinesPE.size() > 0) && (lstColsPE.size() > 0)) {
			qtdePE = lstLinesPE.size() * lstColsPE.size();			
		}
		
		return qtdePE;
	}
}
