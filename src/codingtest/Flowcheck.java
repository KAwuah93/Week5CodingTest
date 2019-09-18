package codingtest;

import java.util.Stack;

public class Flowcheck {
	public static void main(String[] args) {
		String test1 = "()))))";	
		System.out.println(balanced(test1));
	}
	
	static boolean balanced(String x) {
		if (x.length() == 0) return false;
		Stack<Character> chars = new Stack<Character>();
	
		for(int i = 0; i < x.length() ; i++) {
			char z = x.charAt(i);
			if(  z == '[' || z == '(' || z == '{') chars.push(z);
			if( (z == ']' || z == ')' || z == '}') && (chars.size() ) == 0) return false;
			if( (z == ']' && chars.peek() == '[' ) || (z == ')' && chars.peek() == '(' ) || (z == '}' && chars.peek() == '{' )) 
				chars.pop();			
		}
		if (chars.size() == 0) return true;
		return false;
	}
}