package codility.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author dannybastos
 *
 * @description Square Distance 
 */
public class Ex04 {
	public static void main(String[] args) {
		int A=2, B=4, C=2, D=4;
		int result = solution(A, B, C, D);
		System.out.println(result);
	}

	private static int solution(int A, int B, int C, int D) {
		int[] arr = { A, B, C, D };
		Set<int[]> lst = new HashSet<>();
		permute(arr, 0, lst);
		Set<Double> lstSquareDistance = new TreeSet<>();
		for (int[] is : lst) {
			double squareDistance = Math.pow(is[0] - is[1], 2) + Math.pow(is[2] - is[3], 2);
			System.out.println(String.format("points : %s sqDistance:%f", Arrays.toString(is), squareDistance));
			lstSquareDistance.add(squareDistance);
		}
		double result = (double) lstSquareDistance.toArray()[lstSquareDistance.size()-1];
		NumberFormat nf = new DecimalFormat("00");
		return Integer.parseInt(nf.format(result));
	}
	
	private static void permute(int[] arr, int idx, Set<int[]> digits) {
		
		if(idx >= arr.length - 1){
			digits.add(Arrays.copyOf(arr, arr.length));
		}
		
		for (int i =idx; i < arr.length; i++) {
			int aux = arr[idx];
			arr[idx] = arr[i];
			arr[i]=aux;
			permute(arr, idx+1, digits);
			aux = arr[idx];
			arr[idx] = arr[i];
			arr[i] = aux;
		}
	}

}
