package Week_2;

public class Stack_Implementation_ArrayBased {
	int[] arr;
	int i=-1;
	Stack_Implementation_ArrayBased(int n){
		arr=new int[n];
	}
	Stack_Implementation_ArrayBased() {
		arr=new int[10];
	}
	public void push(int val) {
		if(i==arr.length-1) {
			throw new RuntimeException("Stack Overflow");
		}
		arr[++i]=val;
	}
	public int pop() {
	    if (i == -1) {
	        throw new RuntimeException("Stack Underflow");
	    }
	    int x= arr[i];
	    arr[i]=0;
	    i--;
	    return x;
	}

	public int peek() {
	    if (i == -1) {
	        throw new RuntimeException("Stack Underflow");
	    }
	    return arr[i];
	}
	public void display() {
		for(int j=0;j<=i;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	
}
