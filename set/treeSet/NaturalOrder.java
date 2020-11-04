package treeSet;

import java.util.Iterator;
import java.util.TreeSet;
import java.time.LocalDate;

public class NaturalOrder{
	public static void main(String[] args){
		TreeSet<Estudiante> treeSet = new TreeSet<>();
         
		treeSet.add(new Estudiante(1l, "AAA", LocalDate.now()));
		treeSet.add(new Estudiante(4l, "CCC", LocalDate.now()));
		treeSet.add(new Estudiante(5l, "BBB", LocalDate.now()));
		treeSet.add(new Estudiante(2l, "FFF", LocalDate.now()));
		treeSet.add(new Estudiante(3l, "DDD", LocalDate.now()));
		treeSet.add(new Estudiante(6l, "EEE", LocalDate.now()));
		 
		// Crear un iterador para los elementos de TreeSet 
        Iterator<Estudiante> iterator = treeSet.iterator(); 

		while (iterator.hasNext()){
            System.out.println(iterator.next()); 
		}
	}
}