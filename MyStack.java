
public class MyStack {
	int MAX;
	int top;
	char []stack;
	public MyStack(int StackLenght) {
		stack=new char[StackLenght];
		MAX=stack.length;
		top=0;
	}
	public void insert(char value) {
		if(top==MAX) {
			System.out.println("No se admiten más");
			return;
		}stack[top]=value;
		top++;
	}
	public char pop() {
		if(top==0) {
			System.out.println("Stack is empty");
			return (stack[top]);
		}else {
			char top2;
			top2=stack[top-1];
			stack[top]='0';
			top--;
			return(top2);
		}
	}

}
