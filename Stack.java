package src;

public class Stack {
  private int arr[];
  private int top;
  private int size;

  Stack(int capacity) {
    arr = new int[capacity];
    top = -1;
    size = capacity;
  }

  public void push(int item) {
    if (isFull()) {
      System.out.println("is full");
      System.exit(1);
    }
    arr[++top] = item;
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("is empty");
      System.exit(1);
    }
    return arr[top--];
  }

  public int peek() {
    if (isEmpty()) {
      System.exit(1);      
    }
    return arr[top];
  }

  public int size() {
    return top + 1; //back of the array
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean isFull() {
    return top == size - 1;
  }

  public static void main(String[] args) {
    Stack stack = new Stack(4);
    stack.push(3);
    stack.push(5);
    stack.push(8);
    stack.push(2);

    System.out.println(stack.peek());
    stack.pop();
    stack.pop();
    System.out.println(stack.peek());
  }
}
