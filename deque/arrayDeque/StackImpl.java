import java.util.ArrayDeque;

public class StackImpl{
	public static void main(String[] args){
		// Primera opción
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		// Agregar elementos a la pila
		stack.addFirst(0);
		stack.addFirst(1);
		stack.addFirst(2);
		stack.addFirst(3);
		stack.addFirst(4);

		System.out.println("Con addFirst y removeFirst");
		while (!stack.isEmpty()){
			System.out.println(stack.removeFirst() + " ");
		}

		// Salida
		/*
		 * 4
		 * 3
		 * 2
		 * 1
		 * 0
		 */

		// Segunda opción
		ArrayDeque<Integer> stackTwo = new ArrayDeque<Integer>();
		// Agregar elementos a la pila
		stackTwo.push(0);
		stackTwo.push(1);
		stackTwo.push(2);
		stackTwo.push(3);
		stackTwo.push(4);

		System.out.println("Con push y pop");
		while (!stackTwo.isEmpty()){
			System.out.println(stackTwo.pop() + " ");
		}

		// Salida
		/*
		 * 4
		 * 3
		 * 2
		 * 1
		 * 0
		 */
	}
}