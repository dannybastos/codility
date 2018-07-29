package codility.training.lession03.timecomplexity;

public class FrogJmp {

	public static void main(String[] args) {
		int X = 2;
		int Y = 11;
		int D = 3;
		int result = solution(X, Y, D);
		System.out.println(result);
	}
	
	public static int solution(int X, int Y, int D) {
		if (((Y-X) % D) ==  0)
			return (Y-X)/D;
		return ((Y-X)/D)+1;
	}
}
