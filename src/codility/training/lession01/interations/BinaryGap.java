package codility.training.lession01.interations;

public class BinaryGap {

	public static void main(String[] args) {
		int result = 0;
		int A = 1041;
		result = solution(A);
		System.out.println(String.format("Esperado 5 Resultado : %d", result));
		int B = 32;
		result = solution(B);
		System.out.println(String.format("Esperado 0 Resultado : %d", result));
		int C = 15;
		result = solution(C);
		System.out.println(String.format("Esperado 0 Resultado : %d", result));
		int D = 5;
		result = solution(D);
		System.out.println(String.format("Esperado 1 Resultado : %d", result));
	}

	private static int solution(int N) {
		String binaryString = Integer.toBinaryString(N);
		String[] qtdeZeros = binaryString.replace("1", "1,1").split(",");

		int i = 0;
		int result = 0;
		if ((qtdeZeros.length > 0) && qtdeZeros[i].startsWith("1") && qtdeZeros[i].endsWith("1"))
			result = qtdeZeros[0].replace("1", "").length();
		while (i < qtdeZeros.length) {
			String replaceOnes = qtdeZeros[i].replace("1", "");
			if (qtdeZeros[i].startsWith("1") && qtdeZeros[i].endsWith("1") && (replaceOnes.length() > result)) {
				result = replaceOnes.length();
			}
			i++;
		}
		return result;
	}
}
