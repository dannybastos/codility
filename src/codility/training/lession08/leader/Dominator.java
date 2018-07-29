package codility.training.lession08.leader;

import java.util.Arrays;

public class Dominator {

	public static void main(String[] args) {
//		int[] A = {3,4,3,-1,-1,3,3,-1,-1,-1};
//		int[] A = {0,0,1,1,1};
//		int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
		int[] A = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
		int result = solution(A);
		System.out.println(String.format("expected: %d, result: %d",0, result));
	}

	private static int solution(int[] A) {
		int leader = -1;
		int length = A.length;
		
		if (length == 0)
			return -1;
		if (length == 1)
			return 0;
		
		int idx_candidate = length % 2 == 0? (length/2)-1 :length/2;
		int count = 0;
		int[] sortedA = Arrays.copyOf(A, A.length);
		Arrays.sort(sortedA);
		for (int i = 0; i <= idx_candidate; i++) {
			if ((sortedA[i] == sortedA[idx_candidate]) || 
					(sortedA[idx_candidate+i+1] == sortedA[idx_candidate])) {
				count++;
			}
		}

//		if (length % 2 == 0)
//			length--;
		if (count > length/2) {
			int i = 0;
			while (A[i] != sortedA[idx_candidate]) {
				i++;
			}
			leader = i;
		}
		
		return leader;
//		Set<Integer> uniq = new HashSet<>();
//		List<Integer> lst = new ArrayList<>();
//		int freq = 0;
//		int dominatorRule = A.length/2;
//		int result = -1;
//		for (int i = 0; i < A.length; i++) {
//			uniq.add(A[i]);
//			lst.add(A[i]);
//		}
//		for (Integer value : uniq) {
//			freq = Collections.frequency(lst, value);
//			if (freq > dominatorRule)
//				result = lst.indexOf(value);
//		}
//		return result;
	}

}
