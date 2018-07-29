package codility.training.lession03.timecomplexity;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int result = 0;
		 int[] A = { 3, 1, 2, 4, 3 };
		 result = solution(A);
		 System.out.println(String.format("Esperado : 1 retornou %d", result));
		int[] A2 = { -1000, 1000 };
		result = solution(A2);
		System.out.println(String.format("Esperado : 2000 retornou %d", result));
		int[] A3 = { 1, 1 };
		result = solution(A3);
		System.out.println(String.format("Esperado : 0 retornou %d", result));
	}

	private static int solution(int[] A) {
		int[] arrAcumAsc = new int[A.length];
		int[] arrAcumDec = new int[A.length];
		
		int minDiff = 100000;
		int acumAsc = 0;
		int acumDesc = 0;
		int p = A.length-1;
		for (int i = 0; i < A.length-1; i++) {
			acumAsc += A[p-i];
			acumDesc += A[i];
			arrAcumAsc[p-i] = acumAsc;
			arrAcumDec[i] = acumDesc;
		}
		p = A.length-1;
		for (int i = 0; i < arrAcumDec.length-1; i++) {
			int minAbs = Math.abs(arrAcumDec[i]-arrAcumAsc[i+1]);
			if (minAbs < minDiff)
				minDiff = minAbs;  
		}
		return minDiff;
	}
}
