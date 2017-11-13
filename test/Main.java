import java.util.*;

public class Main {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		boolean result = true;
		String input = "((()()(()))(((())))()";

		char c = input.charAt(0);
		if(c == ')') result = false;
		else {
			for(int i = 0; i < input.length(); i++) {
				c = input.charAt(i);
				if(c == '(') {
					stack.push(c);
				} else {
					if(stack.isEmpty()) {
						result = false;
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) result = false;
		}
		if(result) System.out.println("YES");
		else System.out.println("NO");
	}
}