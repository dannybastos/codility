package codility.test;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author dannybastos
 * @description Dice's top face
 */
public class Ex06 {
	private static final int[] A = {1,6,2,3};

	public static void main(String[] args) {
		int result = solution(A);
		System.out.println(String.format("Qty : %d", result));
	}

	private static int solution(int[] A) {
		int idx = 0;
		if (A.length > 100)
			return idx;
		
		Set<Integer> lstQtdeChanges = new TreeSet<>();
		int i = 0;
		int dieFirstValue = 0;
		int rotations = 0;
		while ( dieFirstValue != A[A.length-1]) {
			dieFirstValue = A[idx];
			int dieSecondValue = A[i];
			
			if (dieSecondValue != dieFirstValue) {
				if ((dieSecondValue + dieFirstValue) != 7)
					rotations++;
				else
					rotations = rotations +2;
				
				if (A[i] == A[A.length-1]) {
					lstQtdeChanges.add(rotations);
					rotations = 0;				
					i = -1;
					idx++;
				}
			}
			i++;			
		}
		return (int) lstQtdeChanges.toArray()[0];
	}
}
