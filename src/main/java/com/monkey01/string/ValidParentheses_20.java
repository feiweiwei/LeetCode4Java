package com.monkey01.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:42 18/10/17.
 * @modify by:
 */
public class ValidParentheses_20 {

	public boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		String parentheses;
		for(int i=0;i<s.length();i++){
			parentheses = s.substring(i,i+1);
			if(parentheses.equals("(")||parentheses.equals("[")||parentheses.equals("{")){
				stack.push(parentheses);
			}else {
				if(stack.isEmpty()){
					return false;
				}
				switch (stack.peek().charAt(0)) {
					case '(':
						if(parentheses.equals(")")) {
							stack.pop();
						}else{
							return false;
						}
						break;
					case '[':
						if(parentheses.equals("]")){
							stack.pop();
						}else{
							return false;
						}
						break;
					case '{':
						if(parentheses.equals("}")){
							stack.pop();
						}else{
							return false;
						}
						break;
					default:
						return false;
				}
			}
		}

		if(stack.empty()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isValid2(String s) {
		//利用hashmap，key保存左括号，value保存右括号
		Map<String,String> map = new HashMap<String, String>();
		map.put(")","(");
		map.put("]","[");
		map.put("}","{");

		Stack<String> stack = new Stack<String>();
		String parentheses;
		for(int i=0;i<s.length();i++){
			parentheses = s.substring(i,i+1);
			if(!map.containsKey(parentheses)){
				//如果在map中匹配不上右括号那就是左括号就压入栈
				stack.push(parentheses);
			}else{
				if(!stack.isEmpty() && map.get(parentheses).equals(stack.peek())){
					stack.pop();
				}else{
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
