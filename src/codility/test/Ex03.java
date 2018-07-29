package codility.test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author dannybastos
 * @description Digital Clock
 */
public class Ex03 {
	public static void main(String[] args) {
		int A=9, B=1, C=9, D=7;
		String result = solution(A, B, C, D);
		System.out.println(result);
	}

	private static String solution(int A, int B, int C, int D) {
		int[] arr = { A, B, C, D };
		Set<int[]> lst = new HashSet<>();
		permute(arr, 0, lst);

		Set<LocalTime> lstClock = new TreeSet<>();
		for (int[] is : lst) {
			System.out.println(Arrays.toString(is));			
			String vTime = ""+is[0]+is[1]+":"+is[2]+is[3]+":00";
			try {
				String hora = vTime.split(":")[0];
				String  min = vTime.split(":")[1];
				
				System.out.println(String.format("hora: %s:%s",hora,min));
				if ((Integer.parseInt(hora) < 23) && ((Integer.parseInt(min) < 60))) {
					LocalTime lt = LocalTime.of(Integer.parseInt(hora), Integer.parseInt(min));
					System.out.println(lt.toString());
					lstClock.add(lt);
				}
			} catch (IllegalArgumentException e) {
				System.err.println(String.format("Invalid time:%s", vTime));
			}

		}
		String result = "NOT POSSIBLE";
		if (lstClock.size() > 0)
			result = lstClock.toArray()[lstClock.size()-1]+"";
		return result;
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
