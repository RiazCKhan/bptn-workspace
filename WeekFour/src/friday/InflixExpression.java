package friday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InflixExpression {
    // Complete the function below which converts infix expression to postfix expression 
    // Make use of the imported Classes, that might be useful to you. 
    // Search for the official documentation to understand the imported class behaviors
    

	static String infixToPostfix(String exp){
		
		Stack<String> opStack = new Stack<String>();
		List<String> postFix = new ArrayList<>();
		
		String operand = "()+-/*";
		
		for (int expIndex = 0; expIndex < exp.length(); expIndex++) {
//			System.out.println("Outer Loop compare " + exp.charAt(expIndex));
			
			for (int opIndex = 0; opIndex < operand.length(); opIndex++) {
//				System.out.println("Inner Loop compare " + operand.charAt(opIndex));
				
//				System.out.println("Stack peak" + opStack.peek());
//				If the Stack is Empty then add the Operator to the Stack
//				if (opStack.empty() && exp.charAt(expIndex) == operand.charAt(opIndex)) {
//					opStack.push(Character.toString(operand.charAt(opIndex)));
//				}
				
//				If the Stack Top has the SAME OP = Clash Operator THEN there is a Priority Clash
//				Push the item to the Array
//				else if (!opStack.empty() && (opStack.peek() == Character.toString(exp.charAt(expIndex)))) {
//					postFix.add(Character.toString(operand.charAt(opIndex)));
//				}
				
//				If the Stack Top has a OP Priority = Clash Operator THEN there is a Priority Clash
//				else if (!opStack.empty() && (opStack.peek() == "+") && (Character.toString(exp.charAt(expIndex)) == "-")) {
//					postFix.add(Character.toString(exp.charAt(expIndex)));
//				}
//				
//				else if (!opStack.empty() && (opStack.peek() == "*") && (Character.toString(exp.charAt(expIndex)) == "/")) {
//					postFix.add(Character.toString(exp.charAt(expIndex)));
//				}
//				
//				else if (!opStack.empty() && (opStack.peek() == "(") && (Character.toString(exp.charAt(expIndex)) == ")")) {
//					postFix.add(Character.toString(exp.charAt(expIndex)));	
//				}

//				If the Element is a PostFix push to the Array
//				else if (Character.toString(exp.charAt(expIndex)).contains("1234567890")) {
//					postFix.add(Character.toString(operand.charAt(opIndex)));
//				}
				
			}
			
		}		

//		while (!opStack.empty()) {
//			postFix.add(opStack.pop());
//		}
		
//		System.out.println(Arrays.toString(opStack.toArray()));
//		System.out.println(Arrays.toString(postFix.toArray()));
		
		return "abc";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the infix expression:");
		exp = sc.nextLine();

		// Function call
		System.out.println(infixToPostfix(exp));

	}

}
