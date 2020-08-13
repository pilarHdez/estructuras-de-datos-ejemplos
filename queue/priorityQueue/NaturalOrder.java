package priorityQueue;

import java.util.PriorityQueue;
import java.time.LocalDate;

public class NaturalOrder{
	public static void main(String[] args){
		PriorityQueue<Estudiante> priorityQueue = new PriorityQueue<>();
         
		priorityQueue.add(new Estudiante(1l, "AAA", LocalDate.now()));
		priorityQueue.add(new Estudiante(4l, "CCC", LocalDate.now()));
		priorityQueue.add(new Estudiante(5l, "BBB", LocalDate.now()));
		priorityQueue.add(new Estudiante(2l, "FFF", LocalDate.now()));
		priorityQueue.add(new Estudiante(3l, "DDD", LocalDate.now()));
		priorityQueue.add(new Estudiante(6l, "EEE", LocalDate.now()));
		 
		while(true) 
		{
		    Estudiante e = priorityQueue.poll();
		    System.out.println(e);
		     
		    if(e == null) break;
		}

	}
}