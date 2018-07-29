package codility.training.lession09.maximumsliceproblem;

public class MaxDoubleSliceSum {
	public static void main(String[] args) {
		MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();
//		int[] A = {3,2,6,-1,4,5,-1,2};
//		int[] A = {3,2,6};
//		int[] A = {};
		int[] A = {5, 17, 0, 3}; 
//		Arrays.fill(A, 10);
		int result = maxDoubleSliceSum.solution(A);
		System.out.println(String.format("expected: %d,  result: %d", 17, result));
	}

	public int solution(int[] A) {
		int N = A.length;
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		
		for (int i = 1; i < N-1; i++) {
			arr1[i] = Math.max(arr1[i-1] + A[i], 0);
		}
		
		for (int i = N-2; i > 0; i--) {
			arr2[i] = Math.max(arr2[i+1] + A[i], 0);
		}
		int maxSum = 0;
		
		for (int i = 1; i < N-1; i++) {
			maxSum = Math.max(maxSum, arr1[i-1] + arr2[i+1]);
		}
		return maxSum;
	}
}
