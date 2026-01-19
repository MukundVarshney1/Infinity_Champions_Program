package Week_2;

public class Stack_Client_ArrayBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_Implementation_ArrayBased stack=new Stack_Implementation_ArrayBased(5);
		stack.push(10);
		stack.push(100);
		stack.push(1000);
		stack.push(10000);
		stack.push(100000);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		stack.display();
	}

}
