package wednesday;

class Stack{
	int a[] = new int[Max];
	int top;
	static final int Max = 1000;
	
    Stack(){
		top = -1;
	}

//    Check if Stack is Empty
	boolean isEmpty() {
		// Complete the code for this function
        if (top < 1) {
            return true;
        } else {
            return false;
        }
	}
	
//	Check if Stack is Full
	boolean isFull() {
		return top == Max -1;
	}

	// Complete the code for push function below
    // insert the element x at the right spot in the stack
    // print "Stack Overflow" if you are not able to push the element (stack is already full) and return false
    boolean push(int x) {
		// Complete the code for this function
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
	}
	
    // Complete the code for push function below
    // print "Stack Underflow" if you are not able to pop the element (stack is empty). return 0 in this case
    // return the element popped
	int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return a[top--];
		}
		
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}
	
	void print() {
		for(int i =top; i>-1; i--) {
			System.out.println(" " + a[i]);
		}
	}
}

// Do not modify the code below
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Elements present in stack: ");
		s.print();
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Top element is: " + s.peek());
		System.out.println("Elements present in stack: ");
		s.print();
	}

}
