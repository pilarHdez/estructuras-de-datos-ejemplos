import java.util.LinkedList; 
import java.util.ListIterator;
import java.util.Iterator;

public class PalindromeCharacterSequence {

	/**
    * Función para determinar si un una secuencia de
    * caracteres es palíndromo
    * @param  chars  secuencia de caracteres
    * @return true la secuencia es palíndromo
    */
	public static boolean isPalindrome(LinkedList<Character> chars){

		ListIterator<Character> iterator = chars.listIterator();

		Iterator dIterator =  chars.descendingIterator();

		while (dIterator.hasNext() && iterator.hasNext()) {

			// Basta con que un caracter sea diferente
			// para que no sea considerado palíndromo 
			if(!dIterator.next().equals(iterator.next())){
				return false;
			} 
            
        } 

        // Acaba la iteración todos los caracteres son iguales
        return true;
	}

	// Main 
	public static void main(String[] args){
        LinkedList<Character> chars = new LinkedList();
        
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('a');
        
        System.out.println(isPalindrome(chars));
	}

}