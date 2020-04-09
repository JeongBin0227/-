import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		String[] strs = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calPoints(strs));
	}

	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].charAt(0) == '+') {
				int tmpOne = stack.pop();
				int tmpTwo = stack.pop();
				int pushtmp = tmpOne + tmpTwo;
				answer += pushtmp;
				stack.push(tmpTwo);
				stack.push(tmpOne);
				stack.push(pushtmp);

			} else if (ops[i].charAt(0) == 'C') {
				answer -= stack.pop();

			} else if (ops[i].charAt(0) == 'D') {
				int tmp = stack.pop();
				int pushtmp = tmp * 2;
				answer += pushtmp;
				stack.push(tmp);
				stack.push(pushtmp);

			} else {
				int tmp = Integer.parseInt(ops[i]);
				stack.push(tmp);
				answer += tmp;
			}

		}
		return answer;
	}
}