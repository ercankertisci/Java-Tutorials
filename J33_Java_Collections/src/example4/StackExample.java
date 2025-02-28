package example4;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(10);
		stack.push(15);

		System.out.println("Stack Elemanları: " + stack);
		System.out.println("Pop edilen eleman: " + stack.pop()); // Son eklenen elemanı çıkarır.
		System.out.println("Yeni Stack: " + stack);
	}
}