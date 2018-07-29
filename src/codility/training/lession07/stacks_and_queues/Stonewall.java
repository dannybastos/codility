package codility.training.lession07.stacks_and_queues;

import java.util.Stack;

public class Stonewall {

	private static final int[] H = {8,8,5,7,9,8,7,4,8};
//	private static final int[] H = {1,2};
//	private static final int[] H = {1,2,3};

	public static void main(String[] args) {
		
		int result = solution(H);
		System.out.println(String.format("esperado: 7 resultado: %d", result));
	}

	private static int solution(int[] H) {
		int count = 0;
		Stack<Integer> stack = new Stack<>();
		int N = H.length;
		for (int i = 0; i < N; i++) {
			int height = H[i];
			while (!stack.isEmpty() && height > stack.get(stack.size()-1)) {
				stack.pop();
				count+=1;
			}
			if (stack.isEmpty() || (height < stack.get(stack.size()-1)))
				stack.push(height);
		}
		count+=stack.size();
		return count;		
	}
}
