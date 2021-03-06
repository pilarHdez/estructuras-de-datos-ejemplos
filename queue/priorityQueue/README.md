# PriorityQueue
[PriorityQueue (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/PriorityQueue.html)

### NaturalOrder.java
Ejemplo orden natural en PriorityQueue
```bash
javac priorityQueue/*.java
java priorityQueue/NaturalOrder
```
### CustomOrder.java
Ejemplo orden personalizado en PriorityQueue
```bash
javac priorityQueue/*.java
java priorityQueue/CustomOrder
```

### SmallString.java
Dado un arreglo de cadenas, cada cadena tiene una longitud diferente, determinar cual es la n-ésima cadena más pequeña. 

*Input*: arr[] = {"hola", "cuatro", "feo", "comprobar"} n=2 <br/>
*Output*: hola <br/>
"hola" es la segunda cadena con longitud más pequeña <br/>
<br/>
*Input*: arr[] = {"hola", "cuatro", "feo", "comprobar"} n=1 <br/>
*Output*: feo <br/>

```bash
javac SmallString.java 
java SmallString
```

### DPQ.java
Dado un gráfico con representación de lista de adyacencia de los bordes entre los nodos, la tarea es implementar el algoritmo de Dijkstra para la ruta más corta de una sola fuente utilizando PriorityQueue.
Dado un gráfico y un vértice de origen en el gráfico, encuentre las rutas más cortas desde el origen hasta todos los vértices en el gráfico dado.

```bash
javac DPQ.java 
java DPQ
```