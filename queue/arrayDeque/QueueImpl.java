import java.util.ArrayDeque;

public class QueueImpl{
	public static void main(String[] args){
		// Primera opción
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		// Agregar elementos a la cola
		queue.addFirst(0);
		queue.addFirst(1);
		queue.addFirst(2);
		queue.addFirst(3);
		queue.addFirst(4);

		System.out.println("Con addFirst y removeLast");
		while (!queue.isEmpty()){
			System.out.println(queue.removeLast() + " ");
		}

		// Salida
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 */


		// Segunda opción
		ArrayDeque<Integer> queueTwo = new ArrayDeque<Integer>();
		// Agregar elementos a la cola
		queueTwo.add(0);
		queueTwo.add(1);
		queueTwo.add(2);
		queueTwo.add(3);
		queueTwo.add(4);

		System.out.println("Con add y remove");
		while (!queueTwo.isEmpty()){
			System.out.println(queueTwo.remove() + " ");
		}

		// Salida
		/*
		 * 0
		 * 1
		 * 2
		 * 3
		 * 4
		 */
	}
}