package codility.training.lession07.stacks_and_queues;

public class Nesting {

//	private static final String S = "(()(())())";
	private static final String S = "())(()";

	public static void main(String[] args) {
		int result = solution(S);
		System.out.println(String.format("expected:1, result:%s", result));
	}

	private static int solution(String S) {
		if (S.length() == 0)
			return 1;
		if (S.charAt(0) == ')')
			return 0;
		
		int qtde = 0;
		int i = 0;
		while (i < S.length() && qtde >= 0) {
			if (S.charAt(i) == '(')
				qtde++;
			if (S.charAt(i) == ')')
				qtde--;
			i++;
		}
		int result = qtde == 0 ? 1 : 0;
		return result;
	}

}
