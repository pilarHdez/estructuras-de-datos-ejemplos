# ArrayDeque
[ArrayDeque (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html)

### QueueImpl.java 
Dos opciones de implementación para Colas usando ArrayDeque. 

```bash
javac QueueImpl.java 
java QueueImpl
```

### StackImpl.java
Dos opciones de implementación para Pilas usando ArrayDeque. 

```bash
javac StackImpl.java 
java StackImpl
```

### QueueReverseIterative.java 
Obtener la reversa de una Cola.

*Input*: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] <br/>
*Output*: Q = [100, 90, 80, 70, 60, 50, 40, 30, 20, 10] <br/>
<br/>
*Input*: Q = [1, 2, 3, 4, 5] <br/>
*Output*: Q = [5, 4, 3, 2, 1] <br/>

```bash
javac QueueReverseIterative.java 
java QueueReverseIterative
```

### QueueReverseRecursive.java 
Obtener la reversa de una Cola, de manera recursiva.

*Input*: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] <br/>
*Output*: Q = [100, 90, 80, 70, 60, 50, 40, 30, 20, 10] <br/>
<br/>
*Input*: Q = [1, 2, 3, 4, 5] <br/>
*Output*: Q = [5, 4, 3, 2, 1] <br/>

```bash
javac QueueReverseRecursive.java 
java QueueReverseRecursive
```

### ReverseKelement.java 
Dado un número entero k y una cola de números enteros, necesitamos invertir el orden de los primeros k elementos de la cola, dejando los otros elementos en el mismo orden relativo.

*Input*: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] k = 5 <br/>
*Output*: Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100] <br/>
<br/>
*Input*: Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] k = 4 <br/>
*Output*: Q = [40, 30, 20, 10, 50, 60, 70, 80, 90, 100] <br/>

```bash
javac ReverseKelement.java 
java ReverseKelement
```

### Interleave.java 
Dada una cola de números enteros de longitud uniforme, reorganice los elementos intercalando la primera mitad de la cola con la segunda mitad de la cola.

*Input*: Q = [1 2 3 4] <br/>
*Output*: Q = [1 3 2 4] <br/>
<br/>
*Input*: Q = [11 12 13 14 15 16 17 18 19 200] <br/>
*Output*: Q = [11 16 12 17 13 18 14 19 15 20] <br/>

```bash
javac Interleave.java 
java Interleave
```