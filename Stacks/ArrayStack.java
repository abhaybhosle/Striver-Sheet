package Stacks;

class Stack {
    int size = 10000;
    int arr[] = new int[size];
    int top = -1;

    public boolean isFull() {
        return (size - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return arr[top];
    }

    public void push(int data) {
        if (!isFull()) {
            arr[++top] = data;
            System.out.println("Element pushed into the stack : " + data);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty ");
            return -1;
        } else {
            int val = arr[top];
            top--;
            System.out.println("Poped element is " + val);
            return val;
        }
    }

}

public class ArrayStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
