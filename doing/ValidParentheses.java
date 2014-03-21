// ��Ŀ��http://oj.leetcode.com/problems/valid-parentheses/
// ������http://blog.csdn.net/lilong_dream/article/details/21694751
// 1988lilong@163.com

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		if (s.length() == 0) {
			return true;
		}

		Stack<Character> st = new Stack<Character>();
		st.push(s.charAt(0));

		for (int i = 1; i < s.length(); ++i) {
			if (!st.empty() && isMatch(st.peek(), s.charAt(i))) {
				st.pop();
			}
			else {
				st.push(s.charAt(i));
			}
		}
		
		if(st.empty()) {
			return true;
		}

		return false;
	}

	public boolean isMatch(char s, char p) {
		if ((s == '(' && p == ')') || (s == '{' && p == '}')
				|| (s == '[' && p == ']')) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ValidParentheses slt = new ValidParentheses();
		String s = "(]";
		System.out.println(slt.isValid(s));
	}
}