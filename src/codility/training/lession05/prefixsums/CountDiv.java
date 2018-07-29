package codility.training.lession05.prefixsums;

public class CountDiv {
	public static void main(String[] args) {
		int A = 6, B = 11, K = 2;
		int result = solution(A, B, K);
		System.out.println(result);
	}

	private static int solution(int A, int B, int K) {
		return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
	}
}
